package mod.upcraftlp.spookycraft.proxy;

import mod.upcraftlp.spookycraft.init.SpookyTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author UpcraftLP
 * <b>CLIENT-ONLY</b>
 */
@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        SpookyTabs.SPOOKY_TAB.setIconStack(new ItemStack(Blocks.LIT_PUMPKIN)); //TODO different icon?
    }

    @Override
    public void init(FMLInitializationEvent event) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Override
    public void serverStarting(FMLServerStartingEvent event) {

    }
}
