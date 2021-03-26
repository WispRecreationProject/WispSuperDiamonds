package dev.yhdiamond.wispsuperdiamonds;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

public class ItemManager {
    public static ItemStack SUPER_DIAMOND = ItemBuilder.of(Material.DIAMOND, 1)
            .name(ChatColor.AQUA + "" +  ChatColor.BOLD + "Super Diamond")
            .enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1)
            .flags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE)
            .lore(ChatColor.RESET + "" + ChatColor.GRAY + "Craft these diamonds directly into", ChatColor.RESET + "" + ChatColor.GRAY + "highly overpowered tools and armor!")
            .build();
    public static ItemStack SUPER_PICKAXE = ItemBuilder.of(Material.DIAMOND_PICKAXE, 1)
            .name(ChatColor.AQUA + "" +  ChatColor.BOLD + "Super Diamond Pickaxe")
            .enchantment(Enchantment.DIG_SPEED, 100)
            .enchantment(Enchantment.DURABILITY, 10)
            .enchantment(Enchantment.LOOT_BONUS_BLOCKS, 10)
            .build();
    public static ItemStack SUPER_SWORD = ItemBuilder.of(Material.DIAMOND_SWORD, 1)
            .name(ChatColor.AQUA + "" +  ChatColor.BOLD + "Super Diamond Sword")
            .lore(ChatColor.RESET + "" + ChatColor.GRAY + "Special Ability! Right-click to use Super Jump", ChatColor.RESET + "" + ChatColor.GRAY + "and launch into the air, 30 second cooldown")
            .enchantment(Enchantment.DAMAGE_ALL, 4)
            .build();
    public static ItemStack SUPER_SHOVEL = ItemBuilder.of(Material.DIAMOND_SHOVEL, 1)
            .name(ChatColor.AQUA + "" +  ChatColor.BOLD + "Super Diamond Shovel")
            .enchantment(Enchantment.DIG_SPEED, 100)
            .enchantment(Enchantment.DURABILITY, 5)
            .build();
    public static ItemStack SUPER_AXE = ItemBuilder.of(Material.DIAMOND_AXE, 1)
            .name(ChatColor.AQUA + "" +  ChatColor.BOLD + "Super Diamond Axe")
            .enchantment(Enchantment.DIG_SPEED, 100)
            .enchantment(Enchantment.DURABILITY, 5)
            .build();
    public static ItemStack SUPER_HOE = ItemBuilder.of(Material.DIAMOND_HOE, 1)
            .name(ChatColor.AQUA + "" +  ChatColor.BOLD + "Super Diamond Hoe")
            .enchantment(Enchantment.DIG_SPEED, 100)
            .enchantment(Enchantment.DURABILITY, 10)
            .build();
    public static ItemStack SUPER_CHESTPLATE = ItemBuilder.of(Material.DIAMOND_CHESTPLATE, 1)
            .name(ChatColor.AQUA + "" +  ChatColor.BOLD + "Super Diamond Chestplate")
            .enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4)
            .enchantment(Enchantment.THORNS, 2)
            .build();
    public static ItemStack SUPER_LEGGINGS = ItemBuilder.of(Material.DIAMOND_LEGGINGS, 1)
            .name(ChatColor.AQUA + "" +  ChatColor.BOLD + "Super Diamond Leggings")
            .enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4)
            .build();
    public static ItemStack SUPER_HELMET = ItemBuilder.of(Material.DIAMOND_HELMET, 1)
            .name(ChatColor.AQUA + "" +  ChatColor.BOLD + "Super Diamond Helmet")
            .enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4)
            .enchantment(Enchantment.OXYGEN, 3)
            .build();
    public static ItemStack SUPER_BOOTS = ItemBuilder.of(Material.DIAMOND_BOOTS, 1)
            .name(ChatColor.AQUA + "" +  ChatColor.BOLD + "Super Diamond Boots")
            .enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4)
            .enchantment(Enchantment.DEPTH_STRIDER, 3)
            .build();

}
