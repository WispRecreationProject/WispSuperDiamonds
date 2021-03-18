package dev.yhdiamond.wispsuperdiamonds;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.block.Container;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

public class RightClickListener implements Listener {
    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || (e.getAction().equals(Action.RIGHT_CLICK_BLOCK) && !(e.getClickedBlock() instanceof Container))) {
            if (e.getPlayer().getInventory().getItemInMainHand() != null) {
                if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ItemManager.SUPER_SWORD.getItemMeta().getDisplayName())) {
                    if (WispSuperDiamonds.cooldown.containsKey(e.getPlayer().getUniqueId())) {
                        if (WispSuperDiamonds.cooldown.get(e.getPlayer().getUniqueId()) <= System.currentTimeMillis() - 30000) {
                            Player player = e.getPlayer();
                            Vector vector = new Vector();
                            vector.setY(50);
                            player.setVelocity(player.getVelocity().add(vector));
                            WispSuperDiamonds.cooldown.put(e.getPlayer().getUniqueId(), System.currentTimeMillis());
                            WispSuperDiamonds.flyingplayers.add(e.getPlayer().getUniqueId());
                            e.getPlayer().sendMessage(ChatColor.GREEN + "You have been launched!");
                        } else {
                            e.getPlayer().sendMessage(ChatColor.RED + "This item is on cooldown! Please wait " + (30 - ((System.currentTimeMillis() - WispSuperDiamonds.cooldown.get(e.getPlayer().getUniqueId()))/1000)) + " seconds");
                        }
                    } else {
                        WispSuperDiamonds.cooldown.put(e.getPlayer().getUniqueId(), System.currentTimeMillis());
                        Player player = e.getPlayer();
                        Vector vector = new Vector();
                        vector.setY(50);
                        player.setVelocity(player.getVelocity().add(vector));
                        WispSuperDiamonds.flyingplayers.add(e.getPlayer().getUniqueId());
                        e.getPlayer().sendMessage(ChatColor.GREEN + "You have been launched!");
                    }
                }
            }
        }
    }
}
