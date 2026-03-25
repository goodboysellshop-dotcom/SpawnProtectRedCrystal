package com.goodboysellshop.spawnprotect.utils;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;

import java.util.ArrayList;
import java.util.List;

public class SafeLocationFinder {

    public static List<Location> findSafeLocations(World world, int radius) {
        List<Location> safeLocations = new ArrayList<>();

        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {
                int y = world.getHighestBlockYAt(x, z);
                Location loc = new Location(world, x, y + 1, z);

                // Check if the block at the location is grass
                if (loc.getBlock().getType() == Material.GRASS_BLOCK) {
                    safeLocations.add(loc);
                }
            }
        }
        return safeLocations;
    }
}