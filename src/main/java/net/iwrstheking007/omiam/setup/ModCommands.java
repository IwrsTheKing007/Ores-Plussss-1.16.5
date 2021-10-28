package net.iwrstheking007.omiam.setup;

import com.mojang.brigadier.CommandDispatcher;
import net.iwrstheking007.omiam.common.commands.BaseCommand;
import net.iwrstheking007.omiam.common.commands.impl.MaxCommand;
import net.iwrstheking007.omiam.common.commands.impl.SuperSwordCommand;
import net.minecraft.command.CommandSource;
import net.minecraftforge.event.RegisterCommandsEvent;

import java.util.ArrayList;

public class ModCommands {
    private static final ArrayList<BaseCommand> commands = new ArrayList<BaseCommand>();

    public static void registerCommands(final RegisterCommandsEvent event) {
        CommandDispatcher<CommandSource> dispatcher = event.getDispatcher();

        commands.add(new SuperSwordCommand("supersword", 4, true));
        commands.add(new MaxCommand("max", 2, true));

        commands.forEach(command -> {
            if (command.isEnabled() && command.setExecution() != null) {
                dispatcher.register(command.getBuilder());
            }
        });
    }
}
