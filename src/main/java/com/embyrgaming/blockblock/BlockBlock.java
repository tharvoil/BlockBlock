package com.embyrgaming.blockblock;

import com.embyrgaming.blockblock.Events.BlockBreakEvents;
import com.embyrgaming.blockblock.Events.BlockPlaceEvents;
import org.bukkit.plugin.java.JavaPlugin;

public final class BlockBlock extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BlockBreakEvents(), this);
        getServer().getPluginManager().registerEvents(new BlockPlaceEvents(), this);
        getLogger().info("BlockBlock has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("BlockBlock has been disabled!");
    }
}
