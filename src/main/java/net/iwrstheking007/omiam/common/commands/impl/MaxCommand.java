package net.iwrstheking007.omiam.common.commands.impl;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.iwrstheking007.omiam.common.commands.BaseCommand;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

public class MaxCommand extends BaseCommand {
    public MaxCommand(String name, int permissionLevel, boolean enabled) {
        super(name, permissionLevel, enabled);
    }

    @Override
    public LiteralArgumentBuilder<CommandSource> setExecution() {
        return builder.then(Commands.argument("player", EntityArgument.players()).executes(source -> execute(source.getSource(), EntityArgument.getPlayer(source, "player"), Hand.MAIN_HAND)));
    }

    private int execute(CommandSource source, ServerPlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        int max = itemStack.getMaxStackSize();
        itemStack.setCount(max);

        return Command.SINGLE_SUCCESS;
    }
}
