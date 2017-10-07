package mod.upcraftlp.spookycraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSpecialCandy extends ItemFood {
	public ItemSpecialCandy(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);

	}

	/**
	 * Returns true if this item has an enchantment glint. By default, this
	 * returns <code>stack.isItemEnchanted()</code>, but other items can
	 * override it (for instance, written books always return true).
	 * 
	 * Note that if you override this method, you generally want to also call
	 * the super version (on {@link Item}) to get the glint for enchanted items.
	 * Of course, that is unnecessary if the overwritten version always returns
	 * true.
	 */
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack) {
		return super.hasEffect(stack) || stack.getMetadata() > 0;
	}

	

	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if (!worldIn.isRemote) {

			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 400, 1));
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 6000, 0));
			player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 6000, 0));
			player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 6000, 3));
			player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 6000, 3));

		}
	}

}
