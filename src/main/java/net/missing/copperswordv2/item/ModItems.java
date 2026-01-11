package net.missing.copperswordv2.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.missing.copperswordv2.CopperSwordv2;

public class ModItems {
    public static final Item COPPER_INFUSED_STICK = registerItem("copper_infused_stick", new Item(new Item.Settings()));

    public static final Item BEAN = registerItem("bean", new Item(new Item.Settings()));
    public static final Item BEAN_CORE = registerItem("bean_core", new Item(new Item.Settings()));

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.COPPER, 3, -2.4f))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CopperSwordv2.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CopperSwordv2.LOGGER.info("Registering Mod Items for " + CopperSwordv2.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(COPPER_INFUSED_STICK);
        });
    }
}
