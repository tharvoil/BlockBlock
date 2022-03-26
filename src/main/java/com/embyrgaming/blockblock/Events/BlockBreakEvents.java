package com.embyrgaming.blockblock.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakEvents implements Listener {

    @EventHandler
    public static void onBlockBreak(BlockBreakEvent event) {
        Material block = event.getBlock().getType();
        Player player = event.getPlayer();
        if (!(player.hasPermission("blockblock.break."+block))) {
            player.sendMessage("You do not have permission to break a " + block + " block.");
            event.setCancelled(true);
        }
    }
}
