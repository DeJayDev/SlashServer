package sr.will.slashserver;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.lifecycle.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import com.velocitypowered.api.proxy.server.RegisteredServer;
import java.util.ArrayList;
import java.util.List;

@Plugin(id = PluginInfo.ID,
    name = PluginInfo.NAME,
    description = PluginInfo.DESCRIPTION,
    url = PluginInfo.URL,
    authors = {"Willsr71", "DeJayDev"})
public class SlashServer {

    @Inject
    private ProxyServer proxy;
    private final List<String> registeredCommands = new ArrayList<>();

    @Subscribe
    public void onProxyInitialize(ProxyInitializeEvent event) {
        proxy.commandManager().register("ssreload", new CommandReload(this));

        reload();
    }

    public void reload() {
        registeredCommands.forEach(name -> proxy.commandManager().unregister(name));
        registeredCommands.clear();

        for (RegisteredServer server : proxy.registeredServers()) {
            String name = server.serverInfo().name().toLowerCase();
            proxy.commandManager().register(name, new CommandServer(server));
            registeredCommands.add(name);
        }
    }
}
