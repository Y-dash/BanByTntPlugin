package net.y_dash.minecraft.ban_by_tnt_plugin.banbytntplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class BanByTntPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }
}
