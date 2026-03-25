package com.goodboysellshop.spawnprotect.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

public class MobSpawnListener implements Listener {

    private final JavaPlugin plugin;
    private final Location protectionZoneCenter; // Center of protection zone
    private final int protectionZoneRadius; // Radius of protection zone

    public MobSpawnListener(JavaPlugin plugin, Location protectionZoneCenter, int protectionZoneRadius) {
        this.plugin = plugin;
        this.protectionZoneCenter = protectionZoneCenter;
        this.protectionZoneRadius = protectionZoneRadius;
    }

    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (isInProtectionZone(event.getLocation())) {
            event.setCancelled(true); // Cancel hostile mob spawn
        }
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if (isInProtectionZone(event.getBlock().getLocation())) {
            event.setCancelled(true); // Cancel block breaking
        }
    }

    private boolean isInProtectionZone(Location location) {
        return location.getWorld().equals(protectionZoneCenter.getWorld()) &&
               location.distance(protectionZoneCenter) <= protectionZoneRadius;
    }
}