package com.goodboysellshop.spawnprotect.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class TpSpawnCommand implements CommandExecutor {
    private final JavaPlugin plugin;

    public TpSpawnCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // Check if sender has permission
        if (!sender.hasPermission("goodboysellshop.tpspawn")) {
            sender.sendMessage("§cYou do not have permission to use this command.");
            return true;
        }

        // Logic to teleport the player to spawn
        // TODO: Implement teleport logic

        sender.sendMessage("§aTeleporting to spawn...");
        return true;
    }
}