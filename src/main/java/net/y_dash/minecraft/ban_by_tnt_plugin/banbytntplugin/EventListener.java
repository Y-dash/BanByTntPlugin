package net.y_dash.minecraft.ban_by_tnt_plugin.banbytntplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import static org.bukkit.Bukkit.getLogger;

public class EventListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        if(event.getDeathMessage().indexOf("blown up") == -1) {
            return;
        }

        String targetName = event.getEntity().getName();
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "ban " + targetName);
        getLogger().info(targetName + ": banned by BanByTntPlugin");
    }
}
