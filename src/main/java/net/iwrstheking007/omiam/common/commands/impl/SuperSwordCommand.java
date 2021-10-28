package net.iwrstheking007.omiam.common.commands.impl;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.iwrstheking007.omiam.common.commands.BaseCommand;
import net.iwrstheking007.omiam.setup.ModItems;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;

public class SuperSwordCommand extends BaseCommand {
    public SuperSwordCommand(String name, int permissionLevel, boolean enabled) {
        super(name, permissionLevel, enabled);
    }

    @Override
    public LiteralArgumentBuilder<CommandSource> setExecution() {
        return builder.then(Commands.argument("player", EntityArgument.players()).executes(source -> execute(source.getSource(), EntityArgument.getPlayer(source, "player"))));
    }

    private int execute(CommandSource source, ServerPlayerEntity player) {
        player.addItem(new ItemStack(ModItems.SUPER_SWORD.get()));
        return Command.SINGLE_SUCCESS;
    }
}
