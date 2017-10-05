package mod.upcraftlp.spookycraft.init;

import mod.upcraftlp.spookycraft.Reference;
import mod.upcraftlp.spookycraft.item.ItemBoneMilkBucket;
import mod.upcraftlp.spookycraft.item.ItemEncyclopedia;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author UpcraftLP
 */
@GameRegistry.ObjectHolder(Reference.MODID)
public class SpookyItems {

    public static final Item ENCYCLOPEDIA = new ItemEncyclopedia();
    public static final Item GLASS_STRING = new core.upcraftlp.craftdev.api.item.Item("glass_string");
    public static final Item CANDY_BAG = new core.upcraftlp.craftdev.api.item.Item("candy_bag"); //only obtainable by striking a Skeleton pig with lightning, will give some nice buffs
    public static final Item CANDY_CORN = new core.upcraftlp.craftdev.api.item.Item("candy_corn");
    public static final Item CHOCOLATE_BAR = new core.upcraftlp.craftdev.api.item.Item("chocolate_bar");
}
