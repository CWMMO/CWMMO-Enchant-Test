package me.cwmmodev.cWMMOEnchantTest.utils.guis;

import me.cwmmodev.cWMMOEnchantTest.utils.ConfigHandler;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class enchantGui {

    public static void openEnchantGui(Player player, ItemStack item) {
        if (item == null || item.getType() == Material.AIR) return;

        Inventory inventory = Bukkit.createInventory(player, 54, ConfigHandler.getLocale("gui.title"));

        int slot = 0;
        for (Enchantment enchant : Enchantment.values()) {
            if (enchant.canEnchantItem(item));

            ItemStack book = new ItemStack(Material.ENCHANTED_BOOK);
            ItemMeta bookMeta = book.getItemMeta();

            for (int i = 0; i < enchant.getMaxLevel(); i++) {
                bookMeta.addEnchant(enchant, i, true);
                book.setItemMeta(bookMeta);

                inventory.setItem(slot-1+i, book);
            }
            slot += 9;
        }
    }
}
