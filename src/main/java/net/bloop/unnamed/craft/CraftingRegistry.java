package net.bloop.unnamed.craft;

import cpw.mods.fml.common.registry.GameRegistry;
import fox.spiteful.avaritia.Config;
import fox.spiteful.avaritia.blocks.LudicrousBlocks;
import fox.spiteful.avaritia.compat.Compat;
import fox.spiteful.avaritia.crafting.ExtremeCraftingManager;
import fox.spiteful.avaritia.crafting.ExtremeShapedRecipe;
import fox.spiteful.avaritia.items.LudicrousItems;
import net.bloop.unnamed.block.BlockRegistry;
import net.bloop.unnamed.item.ItemRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class CraftingRegistry {

    public static ShapelessOreRecipe oreCatalyst;

   public static void nienbynien(){

       ExtremeCraftingManager.getInstance().addRecipe(new ItemStack(BlockRegistry.blockOrEOre, 1),
               "mmnininmm",
               "minnnnnim",
               "nncccccnn",
               "incxyzcni",
               "nncnmncnn",
               "incanbcni",
               "nncccccnn",
               "minnnnnim",
               "mmnininmm",
               'm', new ItemStack(LudicrousBlocks.crystal_matrix, 1),
               'n', new ItemStack(LudicrousBlocks.resource_block, 1, 0),
               'i', new ItemStack(LudicrousItems.resource, 1, 6),
               'c', new ItemStack(LudicrousItems.resource, 1, 6),
               'x', new ItemStack(LudicrousItems.singularity, 1, 0),
               'y', new ItemStack(LudicrousItems.singularity, 1, 1),
               'z', new ItemStack(LudicrousItems.singularity, 1, 2),
               'a', new ItemStack(LudicrousItems.singularity, 1, 3),
               'b', new ItemStack(LudicrousItems.singularity, 1, 4));

       //Add oreCatalyst parts
       oreCatalyst = ExtremeCraftingManager.getInstance().addShapelessOreRecipe(new ItemStack(ItemRegistry.orecatalyst),
               new ItemStack(Blocks.coal_ore, 1),
               new ItemStack(Blocks.diamond_ore, 1),
               new ItemStack(Blocks.emerald_ore, 1),
               new ItemStack(Blocks.gold_ore, 1),
               new ItemStack(Blocks.iron_ore, 1),
               new ItemStack(Blocks.lapis_ore, 1),
               new ItemStack(Blocks.quartz_ore, 1),
               new ItemStack(Blocks.redstone_ore, 1));
   }
}