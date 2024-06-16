package weird.is.grape.woodarmor.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum CustomArmorMaterials implements ArmorMaterial  {
	OAK("oak", 8, Util.make(new EnumMap(ArmorItem.ArmorSlot.class), map -> {
		map.put(ArmorItem.ArmorSlot.BOOTS, 1);
		map.put(ArmorItem.ArmorSlot.LEGGINGS, 3);
		map.put(ArmorItem.ArmorSlot.CHESTPLATE, 4);
		map.put(ArmorItem.ArmorSlot.HELMET, 3);
	}), 15, SoundEvents.ITEM_AXE_STRIP, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.OAK_LOG
	)),
	BIRCH("birch", 8, Util.make(new EnumMap(ArmorItem.ArmorSlot.class), map -> {
		map.put(ArmorItem.ArmorSlot.BOOTS, 1);
		map.put(ArmorItem.ArmorSlot.LEGGINGS, 3);
		map.put(ArmorItem.ArmorSlot.CHESTPLATE, 4);
		map.put(ArmorItem.ArmorSlot.HELMET, 3);
	}), 15, SoundEvents.ITEM_AXE_STRIP, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.BIRCH_LOG
	)),
	SPRUCE("spruce", 8, Util.make(new EnumMap(ArmorItem.ArmorSlot.class), map -> {
		map.put(ArmorItem.ArmorSlot.BOOTS, 1);
		map.put(ArmorItem.ArmorSlot.LEGGINGS, 3);
		map.put(ArmorItem.ArmorSlot.CHESTPLATE, 4);
		map.put(ArmorItem.ArmorSlot.HELMET, 3);
	}), 15, SoundEvents.ITEM_AXE_STRIP, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.SPRUCE_LOG
	)),
	CRIMSON("crimson", 8, Util.make(new EnumMap(ArmorItem.ArmorSlot.class), map -> {
		map.put(ArmorItem.ArmorSlot.BOOTS, 1);
		map.put(ArmorItem.ArmorSlot.LEGGINGS, 3);
		map.put(ArmorItem.ArmorSlot.CHESTPLATE, 4);
		map.put(ArmorItem.ArmorSlot.HELMET, 3);
	}), 15, SoundEvents.ITEM_AXE_STRIP, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.CRIMSON_STEM
	)),
	WARPED("warped", 8, Util.make(new EnumMap(ArmorItem.ArmorSlot.class), map -> {
		map.put(ArmorItem.ArmorSlot.BOOTS, 1);
		map.put(ArmorItem.ArmorSlot.LEGGINGS, 3);
		map.put(ArmorItem.ArmorSlot.CHESTPLATE, 4);
		map.put(ArmorItem.ArmorSlot.HELMET, 3);
	}), 15, SoundEvents.ITEM_AXE_STRIP, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.WARPED_STEM
	)),
	DARKOAK("darkoak", 8, Util.make(new EnumMap(ArmorItem.ArmorSlot.class), map -> {
		map.put(ArmorItem.ArmorSlot.BOOTS, 1);
		map.put(ArmorItem.ArmorSlot.LEGGINGS, 3);
		map.put(ArmorItem.ArmorSlot.CHESTPLATE, 4);
		map.put(ArmorItem.ArmorSlot.HELMET, 3);
	}), 15, SoundEvents.ITEM_AXE_STRIP, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.DARK_OAK_LOG
	)),
	JUNGLE("jungle", 8, Util.make(new EnumMap(ArmorItem.ArmorSlot.class), map -> {
		map.put(ArmorItem.ArmorSlot.BOOTS, 1);
		map.put(ArmorItem.ArmorSlot.LEGGINGS, 3);
		map.put(ArmorItem.ArmorSlot.CHESTPLATE, 4);
		map.put(ArmorItem.ArmorSlot.HELMET, 3);
	}), 15, SoundEvents.ITEM_AXE_STRIP, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.JUNGLE_LOG
	)),
	MANGROVE("mangrove", 8, Util.make(new EnumMap(ArmorItem.ArmorSlot.class), map -> {
		map.put(ArmorItem.ArmorSlot.BOOTS, 1);
		map.put(ArmorItem.ArmorSlot.LEGGINGS, 3);
		map.put(ArmorItem.ArmorSlot.CHESTPLATE, 4);
		map.put(ArmorItem.ArmorSlot.HELMET, 3);
	}), 15, SoundEvents.ITEM_AXE_STRIP, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.MANGROVE_LOG
	)),
	ACACIA("acacia", 8, Util.make(new EnumMap(ArmorItem.ArmorSlot.class), map -> {
		map.put(ArmorItem.ArmorSlot.BOOTS, 1);
		map.put(ArmorItem.ArmorSlot.LEGGINGS, 3);
		map.put(ArmorItem.ArmorSlot.CHESTPLATE, 4);
		map.put(ArmorItem.ArmorSlot.HELMET, 3);
	}), 15, SoundEvents.ITEM_AXE_STRIP, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.ACACIA_LOG
	));

	public static final StringIdentifiable.EnumCodec<ArmorMaterials> CODEC = StringIdentifiable.createCodec(ArmorMaterials::values);
	private static final EnumMap<ArmorItem.ArmorSlot, Integer> BASE_DURABILITY_VALUES = Util.make(new EnumMap(ArmorItem.ArmorSlot.class), map -> {
		map.put(ArmorItem.ArmorSlot.BOOTS, 13);
		map.put(ArmorItem.ArmorSlot.LEGGINGS, 15);
		map.put(ArmorItem.ArmorSlot.CHESTPLATE, 16);
		map.put(ArmorItem.ArmorSlot.HELMET, 11);
	});
	private final String name;
	private final int durabilityMultiplier;
	private final EnumMap<ArmorItem.ArmorSlot, Integer> slotProtections;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final Lazy<Ingredient> repairIngredientSupplier;

	private CustomArmorMaterials(
		String name,
		int durabilityMultiplier,
		EnumMap<ArmorItem.ArmorSlot, Integer> slotProtections,
		int enchantability,
		SoundEvent equipSound,
		float toughness,
		float knockbackResistance,
		Supplier<Ingredient> repairIngredientSupplier
	) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.slotProtections = slotProtections;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredientSupplier = new Lazy<>(repairIngredientSupplier);
	}

	@Override
	public int getDurability(ArmorItem.ArmorSlot slot) {
		return BASE_DURABILITY_VALUES.get(slot) * this.durabilityMultiplier;
	}

	@Override
	public int getProtection(ArmorItem.ArmorSlot slot) {
		return this.slotProtections.get(slot);
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredientSupplier.get();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
}
