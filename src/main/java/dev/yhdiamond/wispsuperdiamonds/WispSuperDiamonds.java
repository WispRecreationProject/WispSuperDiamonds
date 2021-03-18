package dev.yhdiamond.wispsuperdiamonds;

import dev.yhdiamond.wispsuperdiamonds.bstats.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;

public final class WispSuperDiamonds extends JavaPlugin {
    public static Map<UUID, Long> cooldown = new HashMap<>();
    public static List<UUID> flyingplayers = new ArrayList<>();
    @Override
    public void onEnable() {
        new Metrics(this, 10723);
        Recipe superDiamondRecipe = new ShapedRecipe(new NamespacedKey(this, "super_diamond"), ItemManager.SUPER_DIAMOND)
                .shape("GD ", "DI ", "   ")
                .setIngredient('G', new RecipeChoice.ExactChoice(new ItemStack(Material.GOLD_INGOT)))
                .setIngredient('D', new RecipeChoice.ExactChoice(new ItemStack(Material.DIAMOND)))
                .setIngredient('I', new RecipeChoice.ExactChoice(new ItemStack(Material.IRON_INGOT)));
        Bukkit.addRecipe(superDiamondRecipe);
        Recipe superDiamondPickaxeRecipe = new ShapedRecipe(new NamespacedKey(this, "super_pickaxe"), ItemManager.SUPER_PICKAXE)
                .shape("DDD", " S ", " S ")
                .setIngredient('S', new RecipeChoice.ExactChoice(new ItemStack(Material.STICK)))
                .setIngredient('D', new RecipeChoice.ExactChoice(ItemManager.SUPER_DIAMOND));
        Bukkit.addRecipe(superDiamondPickaxeRecipe);
        Recipe superDiamondSwordRecipe = new ShapedRecipe(new NamespacedKey(this, "super_sword"), ItemManager.SUPER_SWORD)
                .shape(" D ", " D ", " S ")
                .setIngredient('S', new RecipeChoice.ExactChoice(new ItemStack(Material.STICK)))
                .setIngredient('D', new RecipeChoice.ExactChoice(ItemManager.SUPER_DIAMOND));
        Bukkit.addRecipe(superDiamondSwordRecipe);
        Recipe superDiamondAxeRecipe = new ShapedRecipe(new NamespacedKey(this, "super_axe"), ItemManager.SUPER_AXE)
                .shape("DD ", "DS ", " S ")
                .setIngredient('S', new RecipeChoice.ExactChoice(new ItemStack(Material.STICK)))
                .setIngredient('D', new RecipeChoice.ExactChoice(ItemManager.SUPER_DIAMOND));
        Bukkit.addRecipe(superDiamondAxeRecipe);
        Recipe superDiamondShovelRecipe = new ShapedRecipe(new NamespacedKey(this, "super_shovel"), ItemManager.SUPER_SHOVEL)
                .shape(" D ", " S ", " S ")
                .setIngredient('S', new RecipeChoice.ExactChoice(new ItemStack(Material.STICK)))
                .setIngredient('D', new RecipeChoice.ExactChoice(ItemManager.SUPER_DIAMOND));
        Bukkit.addRecipe(superDiamondShovelRecipe);
        Recipe superDiamondHoeRecipe = new ShapedRecipe(new NamespacedKey(this, "super_hoe"), ItemManager.SUPER_HOE)
                .shape("DD ", " S ", " S ")
                .setIngredient('S', new RecipeChoice.ExactChoice(new ItemStack(Material.STICK)))
                .setIngredient('D', new RecipeChoice.ExactChoice(ItemManager.SUPER_DIAMOND));
        Bukkit.addRecipe(superDiamondHoeRecipe);
        Recipe superDiamondChestPlateRecipe = new ShapedRecipe(new NamespacedKey(this, "super_chestplate"), ItemManager.SUPER_CHESTPLATE)
                .shape("D D", "DDD", "DDD")
                .setIngredient('D', new RecipeChoice.ExactChoice(ItemManager.SUPER_DIAMOND));
        Bukkit.addRecipe(superDiamondChestPlateRecipe);
        Recipe superDiamondLeggingsRecipe = new ShapedRecipe(new NamespacedKey(this, "super_leggings"), ItemManager.SUPER_LEGGINGS)
                .shape("DDD", "D D", "D D")
                .setIngredient('D', new RecipeChoice.ExactChoice(ItemManager.SUPER_DIAMOND));
        Bukkit.addRecipe(superDiamondLeggingsRecipe);
        Recipe superDiamondBootsRecipe = new ShapedRecipe(new NamespacedKey(this, "super_boots"), ItemManager.SUPER_BOOTS)
                .shape("   ", "D D", "D D")
                .setIngredient('D', new RecipeChoice.ExactChoice(ItemManager.SUPER_DIAMOND));
        Bukkit.addRecipe(superDiamondBootsRecipe);
        Recipe superDiamondHelmetRecipe = new ShapedRecipe(new NamespacedKey(this, "super_helmet"), ItemManager.SUPER_HELMET)
                .shape("DDD", "D D", "   ")
                .setIngredient('D', new RecipeChoice.ExactChoice(ItemManager.SUPER_DIAMOND));
        Bukkit.addRecipe(superDiamondHelmetRecipe);
        Bukkit.getPluginManager().registerEvents(new RightClickListener(), this);
        Bukkit.getPluginManager().registerEvents(new DamageListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
