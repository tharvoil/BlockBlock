package com.embyrgaming.blockblock.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlaceEvents implements Listener {

    @EventHandler
    public static void onBlockPlace(BlockPlaceEvent event) {

        Material block = event.getBlock().getType();
        Player player = event.getPlayer();
        if (!(player.hasPermission("blockblock.place."+block))) {
            player.sendMessage("You do not have permission to place a " + block + " block.");
            event.setCancelled(true);
        }
    }
}
