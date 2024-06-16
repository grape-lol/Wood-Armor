package weird.is.grape.woodarmor.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import weird.is.grape.woodarmor.WoodArmor;

public class ItemHandler {
	public static final Item OAK_HELMET = reigsterItem("oak_helmet",
		new OakArmorItem(CustomArmorMaterials.OAK, ArmorItem.ArmorSlot.HELMET, new QuiltItemSettings()));
	public static final Item OAK_CHESTPLATE = reigsterItem("oak_chestplate",
		new OakArmorItem(CustomArmorMaterials.OAK, ArmorItem.ArmorSlot.CHESTPLATE, new QuiltItemSettings()));
	public static final Item OAK_LEGGINGS = reigsterItem("oak_leggings",
		new OakArmorItem(CustomArmorMaterials.OAK, ArmorItem.ArmorSlot.LEGGINGS, new QuiltItemSettings()));
	public static final Item OAK_BOOTS = reigsterItem("oak_boots",
		new OakArmorItem(CustomArmorMaterials.OAK, ArmorItem.ArmorSlot.BOOTS, new QuiltItemSettings()));

	public static void addItemsToItemGroup() {
		addToItemGroup(OAK_BOOTS);
		addToItemGroup(OAK_LEGGINGS);
		addToItemGroup(OAK_CHESTPLATE);
		addToItemGroup(OAK_HELMET);
	}

	private static void addToItemGroup(Item item) {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addItem(item));
	}

	private static Item reigsterItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(WoodArmor.MOD_ID, name), item);
	}
}
