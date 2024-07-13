package net.bourbeau.test1.item;

import net.bourbeau.test1.Test1;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItem.Settings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

// fix
public class Moditems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItem.Settings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Test1.MOD_ID, name), item);

    }


    public static void registerModItems() {
        Test1.LOGGER.info("Registering Mod Items for " + Test1.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditems::addItemsToIngredientTabItemGroup);
    }
}


