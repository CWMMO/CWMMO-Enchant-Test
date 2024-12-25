package me.cwmmodev.cWMMOEnchantTest.Commands;

import me.cwmmodev.cWMMOEnchantTest.utils.ConfigHandler;
import me.cwmmodev.cWMMOEnchantTest.utils.guis.enchantGui;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class EnchantCatalogue implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender,
                             @NotNull Command command,
                             @NotNull String label,
                             @NotNull String[] args)
    {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack item = player.getActiveItem();

            /*
            im scared of women :I
             */
            if (item == null || item.getType() == Material.AIR) {
                player.sendMessage(ConfigHandler.getLocale("utils.errors.invalidItemError"));
                return true;
            }

            enchantGui.openEnchantGui(player, item);
        } else {
            Bukkit.getConsoleSender().sendMessage("Only players can run this command.");
        }
        return true;
    }
}
