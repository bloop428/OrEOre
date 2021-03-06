package net.bloop.oreore;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.bloop.oreore.block.BlockRegistry;
import net.bloop.oreore.craft.CraftingRegistry;
import net.bloop.oreore.gui.GuiHandler;
import net.bloop.oreore.item.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = "oreore", version = "0.1")
public class OrEOreMod
{
    @Mod.Instance
    public static OrEOreMod instance;

    public static CreativeTabs tab = new CreativeTabs("oreore")
    {
        @Override
        public Item getTabIconItem() {
            return ItemRegistry.orecatalyst;
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        BlockRegistry.registerThings();
        ItemRegistry.oreThings();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        CraftingRegistry.nienbynien();
    }
}
