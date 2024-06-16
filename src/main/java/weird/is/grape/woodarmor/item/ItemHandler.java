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
		new ArmorItemTemplate(CustomArmorMaterials.OAK, ArmorItem.ArmorSlot.HELMET, new QuiltItemSettings()));
	public static final Item OAK_CHESTPLATE = reigsterItem("oak_chestplate",
		new ArmorItemTemplate(CustomArmorMaterials.OAK, ArmorItem.ArmorSlot.CHESTPLATE, new QuiltItemSettings()));
	public static final Item OAK_LEGGINGS = reigsterItem("oak_leggings",
		new ArmorItemTemplate(CustomArmorMaterials.OAK, ArmorItem.ArmorSlot.LEGGINGS, new QuiltItemSettings()));
	public static final Item OAK_BOOTS = reigsterItem("oak_boots",
		new ArmorItemTemplate(CustomArmorMaterials.OAK, ArmorItem.ArmorSlot.BOOTS, new QuiltItemSettings()));

	public static final Item BIRCH_HELMET = reigsterItem("birch_helmet",
		new ArmorItemTemplate(CustomArmorMaterials.BIRCH, ArmorItem.ArmorSlot.HELMET, new QuiltItemSettings()));
	public static final Item BIRCH_CHESTPLATE = reigsterItem("birch_chestplate",
		new ArmorItemTemplate(CustomArmorMaterials.BIRCH, ArmorItem.ArmorSlot.CHESTPLATE, new QuiltItemSettings()));
	public static final Item BIRCH_LEGGINGS = reigsterItem("birch_leggings",
		new ArmorItemTemplate(CustomArmorMaterials.BIRCH, ArmorItem.ArmorSlot.LEGGINGS, new QuiltItemSettings()));
	public static final Item BIRCH_BOOTS = reigsterItem("birch_boots",
		new ArmorItemTemplate(CustomArmorMaterials.BIRCH, ArmorItem.ArmorSlot.BOOTS, new QuiltItemSettings()));

	public static final Item SPRUCE_HELMET = reigsterItem("spruce_helmet",
		new ArmorItemTemplate(CustomArmorMaterials.SPRUCE, ArmorItem.ArmorSlot.HELMET, new QuiltItemSettings()));
	public static final Item SPRUCE_CHESTPLATE = reigsterItem("spruce_chestplate",
		new ArmorItemTemplate(CustomArmorMaterials.SPRUCE, ArmorItem.ArmorSlot.CHESTPLATE, new QuiltItemSettings()));
	public static final Item SPRUCE_LEGGINGS = reigsterItem("spruce_leggings",
		new ArmorItemTemplate(CustomArmorMaterials.SPRUCE, ArmorItem.ArmorSlot.LEGGINGS, new QuiltItemSettings()));
	public static final Item SPRUCE_BOOTS = reigsterItem("spruce_boots",
		new ArmorItemTemplate(CustomArmorMaterials.SPRUCE, ArmorItem.ArmorSlot.BOOTS, new QuiltItemSettings()));

	public static final Item CRIMSON_HELMET = reigsterItem("crimson_helmet",
		new ArmorItemTemplate(CustomArmorMaterials.CRIMSON, ArmorItem.ArmorSlot.HELMET, new QuiltItemSettings()));
	public static final Item CRIMSON_CHESTPLATE = reigsterItem("crimson_chestplate",
		new ArmorItemTemplate(CustomArmorMaterials.CRIMSON, ArmorItem.ArmorSlot.CHESTPLATE, new QuiltItemSettings()));
	public static final Item CRIMSON_LEGGINGS = reigsterItem("crimson_leggings",
		new ArmorItemTemplate(CustomArmorMaterials.CRIMSON, ArmorItem.ArmorSlot.LEGGINGS, new QuiltItemSettings()));
	public static final Item CRIMSON_BOOTS = reigsterItem("crimson_boots",
		new ArmorItemTemplate(CustomArmorMaterials.CRIMSON, ArmorItem.ArmorSlot.BOOTS, new QuiltItemSettings()));

	public static final Item WARPED_HELMET = reigsterItem("warped_helmet",
		new ArmorItemTemplate(CustomArmorMaterials.WARPED, ArmorItem.ArmorSlot.HELMET, new QuiltItemSettings()));
	public static final Item WARPED_CHESTPLATE = reigsterItem("warped_chestplate",
		new ArmorItemTemplate(CustomArmorMaterials.WARPED, ArmorItem.ArmorSlot.CHESTPLATE, new QuiltItemSettings()));
	public static final Item WARPED_LEGGINGS = reigsterItem("warped_leggings",
		new ArmorItemTemplate(CustomArmorMaterials.WARPED, ArmorItem.ArmorSlot.LEGGINGS, new QuiltItemSettings()));
	public static final Item WARPED_BOOTS = reigsterItem("warped_boots",
		new ArmorItemTemplate(CustomArmorMaterials.WARPED, ArmorItem.ArmorSlot.BOOTS, new QuiltItemSettings()));

	public static final Item DARKOAK_HELMET = reigsterItem("darkoak_helmet",
		new ArmorItemTemplate(CustomArmorMaterials.DARKOAK, ArmorItem.ArmorSlot.HELMET, new QuiltItemSettings()));
	public static final Item DARKOAK_CHESTPLATE = reigsterItem("darkoak_chestplate",
		new ArmorItemTemplate(CustomArmorMaterials.DARKOAK, ArmorItem.ArmorSlot.CHESTPLATE, new QuiltItemSettings()));
	public static final Item DARKOAK_LEGGINGS = reigsterItem("darkoak_leggings",
		new ArmorItemTemplate(CustomArmorMaterials.DARKOAK, ArmorItem.ArmorSlot.LEGGINGS, new QuiltItemSettings()));
	public static final Item DARKOAK_BOOTS = reigsterItem("darkoak_boots",
		new ArmorItemTemplate(CustomArmorMaterials.DARKOAK, ArmorItem.ArmorSlot.BOOTS, new QuiltItemSettings()));

	public static final Item JUNGLE_HELMET = reigsterItem("jungle_helmet",
		new ArmorItemTemplate(CustomArmorMaterials.JUNGLE, ArmorItem.ArmorSlot.HELMET, new QuiltItemSettings()));
	public static final Item JUNGLE_CHESTPLATE = reigsterItem("jungle_chestplate",
		new ArmorItemTemplate(CustomArmorMaterials.JUNGLE, ArmorItem.ArmorSlot.CHESTPLATE, new QuiltItemSettings()));
	public static final Item JUNGLE_LEGGINGS = reigsterItem("jungle_leggings",
		new ArmorItemTemplate(CustomArmorMaterials.JUNGLE, ArmorItem.ArmorSlot.LEGGINGS, new QuiltItemSettings()));
	public static final Item JUNGLE_BOOTS = reigsterItem("jungle_boots",
		new ArmorItemTemplate(CustomArmorMaterials.JUNGLE, ArmorItem.ArmorSlot.BOOTS, new QuiltItemSettings()));

	public static final Item MANGROVE_HELMET = reigsterItem("mangrove_helmet",
		new ArmorItemTemplate(CustomArmorMaterials.MANGROVE, ArmorItem.ArmorSlot.HELMET, new QuiltItemSettings()));
	public static final Item MANGROVE_CHESTPLATE = reigsterItem("mangrove_chestplate",
		new ArmorItemTemplate(CustomArmorMaterials.MANGROVE, ArmorItem.ArmorSlot.CHESTPLATE, new QuiltItemSettings()));
	public static final Item MANGROVE_LEGGINGS = reigsterItem("mangrove_leggings",
		new ArmorItemTemplate(CustomArmorMaterials.MANGROVE, ArmorItem.ArmorSlot.LEGGINGS, new QuiltItemSettings()));
	public static final Item MANGROVE_BOOTS = reigsterItem("mangrove_boots",
		new ArmorItemTemplate(CustomArmorMaterials.MANGROVE, ArmorItem.ArmorSlot.BOOTS, new QuiltItemSettings()));

	public static final Item ACACIA_HELMET = reigsterItem("acacia_helmet",
		new ArmorItemTemplate(CustomArmorMaterials.ACACIA, ArmorItem.ArmorSlot.HELMET, new QuiltItemSettings()));
	public static final Item ACACIA_CHESTPLATE = reigsterItem("acacia_chestplate",
		new ArmorItemTemplate(CustomArmorMaterials.ACACIA, ArmorItem.ArmorSlot.CHESTPLATE, new QuiltItemSettings()));
	public static final Item ACACIA_LEGGINGS = reigsterItem("acacia_leggings",
		new ArmorItemTemplate(CustomArmorMaterials.ACACIA, ArmorItem.ArmorSlot.LEGGINGS, new QuiltItemSettings()));
	public static final Item ACACIA_BOOTS = reigsterItem("acacia_boots",
		new ArmorItemTemplate(CustomArmorMaterials.ACACIA, ArmorItem.ArmorSlot.BOOTS, new QuiltItemSettings()));

	public static void addItemsToItemGroup() {
		addToItemGroup(ACACIA_HELMET);
		addToItemGroup(ACACIA_CHESTPLATE);
		addToItemGroup(ACACIA_LEGGINGS);
		addToItemGroup(ACACIA_BOOTS);
		addToItemGroup(MANGROVE_HELMET);
		addToItemGroup(MANGROVE_CHESTPLATE);
		addToItemGroup(MANGROVE_LEGGINGS);
		addToItemGroup(MANGROVE_BOOTS);
		addToItemGroup(OAK_HELMET);
		addToItemGroup(OAK_CHESTPLATE);
		addToItemGroup(OAK_LEGGINGS);
		addToItemGroup(OAK_BOOTS);
		addToItemGroup(DARKOAK_HELMET);
		addToItemGroup(DARKOAK_CHESTPLATE);
		addToItemGroup(DARKOAK_LEGGINGS);
		addToItemGroup(DARKOAK_BOOTS);
		addToItemGroup(BIRCH_HELMET);
		addToItemGroup(BIRCH_CHESTPLATE);
		addToItemGroup(BIRCH_LEGGINGS);
		addToItemGroup(BIRCH_BOOTS);
		addToItemGroup(SPRUCE_HELMET);
		addToItemGroup(SPRUCE_CHESTPLATE);
		addToItemGroup(SPRUCE_LEGGINGS);
		addToItemGroup(SPRUCE_BOOTS);
		addToItemGroup(JUNGLE_HELMET);
		addToItemGroup(JUNGLE_CHESTPLATE);
		addToItemGroup(JUNGLE_LEGGINGS);
		addToItemGroup(JUNGLE_BOOTS);
		addToItemGroup(CRIMSON_HELMET);
		addToItemGroup(CRIMSON_CHESTPLATE);
		addToItemGroup(CRIMSON_LEGGINGS);
		addToItemGroup(CRIMSON_BOOTS);
		addToItemGroup(WARPED_HELMET);
		addToItemGroup(WARPED_CHESTPLATE);
		addToItemGroup(WARPED_LEGGINGS);
		addToItemGroup(WARPED_BOOTS);
	}

	private static void addToItemGroup(Item item) {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addItem(item));
	}

	private static Item reigsterItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(WoodArmor.MOD_ID, name), item);
	}
}
