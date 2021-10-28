package net.iwrstheking007.omiam.common.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class MjolnirHammer extends SwordItem {
    private final double range;
    public MjolnirHammer(IItemTier tier, int damage, float attackSpeed, double thunderRange, Properties properties) {
        super(tier, damage, attackSpeed, properties);
        this.range = thunderRange;
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        BlockRayTraceResult ray = rayTrace(world, user, RayTraceContext.FluidMode.NONE);
        BlockPos lookPos = ray.getBlockPos().relative(ray.getDirection());
        LightningBoltEntity lightningBoltEntity = EntityType.LIGHTNING_BOLT.create(world);
        assert lightningBoltEntity != null;
        lightningBoltEntity.setPos(lookPos.getX(), lookPos.getY(), lookPos.getZ());
        world.addFreshEntity(lightningBoltEntity);
        return super.use(world, user, hand);
    }


    protected BlockRayTraceResult rayTrace(World world, PlayerEntity player, RayTraceContext.FluidMode fluidMode) {
        float f = player.xRot;
        float f1 = player.yRot;
        Vector3d vector3d = player.getEyePosition(1.0F);
        float f2 = MathHelper.cos(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f3 = MathHelper.sin(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f4 = -MathHelper.cos(-f * ((float)Math.PI / 180F));
        float f5 = MathHelper.sin(-f * ((float)Math.PI / 180F));
        float f6 = f3 * f4;
        float f7 = f2 * f4;
        Vector3d vector3d1 = vector3d.add((double)f6 * this.range, (double)f5 * this.range, (double)f7 * this.range);
        return world.clip(new RayTraceContext(vector3d, vector3d1, RayTraceContext.BlockMode.OUTLINE, fluidMode, player));
    }
}
