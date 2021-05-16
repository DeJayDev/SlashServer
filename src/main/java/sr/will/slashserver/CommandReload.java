package sr.will.slashserver;

import com.velocitypowered.api.command.SimpleCommand;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public class CommandReload implements SimpleCommand {

    private final SlashServer plugin;

    public CommandReload(SlashServer plugin) {
        this.plugin = plugin;
    }

    @Override
    public void execute(SimpleCommand.Invocation invocation) {
        plugin.reload();
        invocation.source().sendMessage(Component.text("Plugin reloaded!", NamedTextColor.GREEN));
    }

    @Override
    public boolean hasPermission(Invocation invocation) {
        return invocation.source().hasPermission("slashserver.reload");
    }
}
