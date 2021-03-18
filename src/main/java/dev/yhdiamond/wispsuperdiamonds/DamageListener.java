package dev.yhdiamond.wispsuperdiamonds;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageListener implements Listener {
    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        if (e.getCause().equals(EntityDamageEvent.DamageCause.FALL)) {
            if (WispSuperDiamonds.flyingplayers.contains(e.getEntity().getUniqueId())) {
                e.setCancelled(true);
                WispSuperDiamonds.flyingplayers.remove(e.getEntity().getUniqueId());
            }
        }
    }
}
