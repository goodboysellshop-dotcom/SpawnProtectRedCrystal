package com.goodboysellshop.spawnprotect.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockInteractListener implements Listener {
    private final JavaPlugin plugin;

    public BlockInteractListener(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockInteract(BlockInteractEvent event) {
        // Check if the player is in the spawn protection zone
        if (isInSpawnProtection(event.getPlayer().getLocation())) {
            event.setCancelled(true);
            plugin.getServer().getPlayer(event.getPlayer().getUniqueId()).sendMessage("You cannot interact with blocks in the spawn protection zone.");
        }
    }

    private boolean isInSpawnProtection(Location location) {
        // Logic to determine if the location is within the spawn protection zone
        // Replace with your actual spawn protection logic
        return true; // Placeholder logic, implement your conditions
    }
}