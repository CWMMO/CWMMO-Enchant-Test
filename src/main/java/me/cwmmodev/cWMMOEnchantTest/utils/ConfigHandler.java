package me.cwmmodev.cWMMOEnchantTest.utils;


import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;

import java.util.Objects;

import static me.cwmmodev.cWMMOEnchantTest.CWMMOEnchantTest.plugin;

public class ConfigHandler {

    public static Component getLocale(String path) {
        String string = Objects.requireNonNull(plugin.getConfig().getString(path));
        String color = Objects.requireNonNull(plugin.getConfig().getString("utils.color"));

        return (Component.text(string)
                .color(TextColor.fromHexString(color))
        );
    }
    public static boolean getBoolean(String path) { return plugin.getConfig().getBoolean(path); }
}
