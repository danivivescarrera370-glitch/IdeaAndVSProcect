package net.example.greendelight.block;

import net.example.greendelight.GreenDelight;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import vectorwing.farmersdelight.common.block.PieBlock;

public class ModBlocks {

    // 1. Register only the Green Apple Pie Block using Farmer's Delight's PieBlock class
    public static final Block GREEN_APPLE_PIE = registerBlock("green_apple_pie",
            new PieBlock(AbstractBlock.Settings.copy(Blocks.CAKE)
                    .sounds(BlockSoundGroup.WOOL)));

    // 2. Helper method to register the Block and its accompanying placeable BlockItem
    private static Block registerBlock(String name, Block block) {
        Identifier id = Identifier.of(GreenDelight.MOD_ID, name);

        // Register the Item form (max stack size of 64 like standard FD pies)
        Registry.register(Registries.ITEM, id, new BlockItem(block, new Item.Settings().maxCount(64)));

        // Register the Block form
        return Registry.register(Registries.BLOCK, id, block);
    }

    // 3. Initializer method called in your main entrypoint
    public static void registerModBlocks() {
        GreenDelight.LOGGER.info("Registering Green Apple Pie block for " + GreenDelight.MOD_ID);
    }
}
