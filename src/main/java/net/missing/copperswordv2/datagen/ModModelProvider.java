package net.missing.copperswordv2.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.missing.copperswordv2.block.ModBlocks;
import net.missing.copperswordv2.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COPPER_INFUSED_STICK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEAN_CORE, Models.GENERATED);

        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);
    }
}
