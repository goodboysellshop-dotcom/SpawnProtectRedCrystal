package com.goodboysellshop.spawnprotect.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

public class PlayerMoveListener implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        // Handle player movement logic here
    }

    @EventHandler
    public void onPlayerTeleport(PlayerTeleportEvent event) {
        // Handle player teleportation logic here
    }
}