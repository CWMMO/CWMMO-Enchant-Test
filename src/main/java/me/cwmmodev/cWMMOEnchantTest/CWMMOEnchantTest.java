package me.cwmmodev.cWMMOEnchantTest;

import org.bukkit.plugin.java.JavaPlugin;

public final class CWMMOEnchantTest extends JavaPlugin {

    public static CWMMOEnchantTest plugin;

    @Override
    public void onEnable() {
        plugin = this;

        saveDefaultConfig();


    }
}
