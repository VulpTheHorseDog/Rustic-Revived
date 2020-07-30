package com.vulp.rusticrevived;

import com.vulp.rusticrevived.blocks.*;
import com.vulp.rusticrevived.blocks.trees.IronwoodTree;
import com.vulp.rusticrevived.blocks.trees.OliveTree;
import com.vulp.rusticrevived.init.BlockInit;
import com.vulp.rusticrevived.init.ItemInit;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class Registry {

    public static final ItemGroup RUSTIC_REVIVED = new RusticRevivedItemGroup("Rustic Revived");

    // ITEM REGISTRATION
    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent)
    {
        itemRegistryEvent.getRegistry().registerAll
                (
                        ItemInit.ironwood_log = new BlockItem(BlockInit.ironwood_log, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.ironwood_log.getRegistryName()),
                        ItemInit.stripped_ironwood_log = new BlockItem(BlockInit.stripped_ironwood_log, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.stripped_ironwood_log.getRegistryName()),
                        ItemInit.ironwood_leaves = new BlockItem(BlockInit.ironwood_leaves, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.ironwood_leaves.getRegistryName()),
                        ItemInit.ironwood_sapling = new BlockItem(BlockInit.ironwood_sapling, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.ironwood_sapling.getRegistryName()),
                        ItemInit.ironwood_planks = new BlockItem(BlockInit.ironwood_planks, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.ironwood_planks.getRegistryName()),
                        ItemInit.stripped_ironwood_wood = new BlockItem(BlockInit.stripped_ironwood_wood, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.stripped_ironwood_wood.getRegistryName()),
                        ItemInit.ironwood_wood = new BlockItem(BlockInit.ironwood_wood, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.ironwood_wood.getRegistryName()),
                        ItemInit.ironwood_slab = new BlockItem(BlockInit.ironwood_slab, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.ironwood_slab.getRegistryName()),
                        ItemInit.ironwood_stairs = new BlockItem(BlockInit.ironwood_stairs, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.ironwood_stairs.getRegistryName()),
                        ItemInit.ironwood_fence = new BlockItem(BlockInit.ironwood_fence, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.ironwood_fence.getRegistryName()),
                        ItemInit.ironwood_fence_gate = new BlockItem(BlockInit.ironwood_fence_gate, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.ironwood_fence_gate.getRegistryName()),
                        ItemInit.ironwood_pressure_plate = new BlockItem(BlockInit.ironwood_pressure_plate, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.ironwood_pressure_plate.getRegistryName()),
                        ItemInit.ironwood_button = new BlockItem(BlockInit.ironwood_button, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.ironwood_button.getRegistryName()),
                        ItemInit.ironwood_trapdoor = new BlockItem(BlockInit.ironwood_trapdoor, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.ironwood_trapdoor.getRegistryName()),
                        ItemInit.ironwood_door = new BlockItem(BlockInit.ironwood_door, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.ironwood_door.getRegistryName()),

                        ItemInit.olive_log = new BlockItem(BlockInit.olive_log, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.olive_log.getRegistryName()),
                        ItemInit.stripped_olive_log = new BlockItem(BlockInit.stripped_olive_log, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.stripped_olive_log.getRegistryName()),
                        ItemInit.olive_leaves = new BlockItem(BlockInit.olive_leaves, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.olive_leaves.getRegistryName()),
                        ItemInit.olive_sapling = new BlockItem(BlockInit.olive_sapling, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.olive_sapling.getRegistryName()),
                        ItemInit.olive_planks = new BlockItem(BlockInit.olive_planks, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.olive_planks.getRegistryName()),
                        ItemInit.stripped_olive_wood = new BlockItem(BlockInit.stripped_olive_wood, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.stripped_olive_wood.getRegistryName()),
                        ItemInit.olive_wood = new BlockItem(BlockInit.olive_wood, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.olive_wood.getRegistryName()),
                        ItemInit.olive_slab = new BlockItem(BlockInit.olive_slab, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.olive_slab.getRegistryName()),
                        ItemInit.olive_stairs = new BlockItem(BlockInit.olive_stairs, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.olive_stairs.getRegistryName()),
                        ItemInit.olive_fence = new BlockItem(BlockInit.olive_fence, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.olive_fence.getRegistryName()),
                        ItemInit.olive_fence_gate = new BlockItem(BlockInit.olive_fence_gate, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.olive_fence_gate.getRegistryName()),
                        ItemInit.olive_pressure_plate = new BlockItem(BlockInit.olive_pressure_plate, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.olive_pressure_plate.getRegistryName()),
                        ItemInit.olive_button = new BlockItem(BlockInit.olive_button, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.olive_button.getRegistryName()),
                        ItemInit.olive_trapdoor = new BlockItem(BlockInit.olive_trapdoor, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.olive_trapdoor.getRegistryName()),
                        ItemInit.olive_door = new BlockItem(BlockInit.olive_door, new Item.Properties().group(RUSTIC_REVIVED)).setRegistryName(BlockInit.olive_door.getRegistryName())

                );
        RusticRevived.LOGGER.info("Items registered.");
    }

    // BLOCK REGISTRATION
    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> BlockRegistryEvent)
    {
        BlockRegistryEvent.getRegistry().registerAll
                (
                        BlockInit.ironwood_log = new LogBlock(MaterialColor.WOOD, LogBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.0f, 5.0f).harvestTool(ToolType.AXE).harvestLevel(0).sound(SoundType.WOOD)).setRegistryName(location("ironwood_log")),
                        BlockInit.stripped_ironwood_log = new LogBlock(MaterialColor.WOOD, LogBlock.Properties.from(BlockInit.ironwood_log)).setRegistryName(location("stripped_ironwood_log")),
                        BlockInit.ironwood_leaves = new LeavesBlock(LeavesBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2f).tickRandomly().sound(SoundType.PLANT).notSolid()).setRegistryName(location("ironwood_leaves")),
                        BlockInit.ironwood_sapling = new CustomSaplingBlock(IronwoodTree::new, CustomSaplingBlock.Properties.create(Material.PLANTS).hardnessAndResistance(0.0f).tickRandomly().doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName(location("ironwood_sapling")),
                        BlockInit.potted_ironwood_sapling = new FlowerPotBlock(BlockInit.ironwood_sapling, FlowerPotBlock.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).sound(SoundType.STONE)).setRegistryName(location("potted_ironwood_sapling")),
                        BlockInit.ironwood_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 5.0f).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("ironwood_planks")),
                        BlockInit.stripped_ironwood_wood = new RotatedPillarBlock(RotatedPillarBlock.Properties.from(BlockInit.ironwood_log)).setRegistryName(location("stripped_ironwood_wood")),
                        BlockInit.ironwood_wood = new RotatedPillarBlock(RotatedPillarBlock.Properties.from(BlockInit.ironwood_log)).setRegistryName(location("ironwood_wood")),
                        BlockInit.ironwood_slab = new SlabBlock(SlabBlock.Properties.from(BlockInit.ironwood_planks)).setRegistryName(location("ironwood_slab")),
                        BlockInit.ironwood_stairs = new StairsBlock(() -> BlockInit.ironwood_planks.getDefaultState(), StairsBlock.Properties.from(BlockInit.ironwood_planks)).setRegistryName(location("ironwood_stairs")),
                        BlockInit.ironwood_fence = new FenceBlock(FenceBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.0f, 3.0f).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("ironwood_fence")),
                        BlockInit.ironwood_fence_gate = new FenceGateBlock(FenceGateBlock.Properties.from(BlockInit.ironwood_fence)).setRegistryName(location("ironwood_fence_gate")),
                        BlockInit.ironwood_pressure_plate = new CustomPressurePlateBlock(CustomPressurePlateBlock.Sensitivity.EVERYTHING, CustomPressurePlateBlock.Properties.create(Material.WOOD).hardnessAndResistance(0.5f).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("ironwood_pressure_plate")),
                        BlockInit.ironwood_button = new CustomWoodButtonBlock(CustomWoodButtonBlock.Properties.create(Material.WOOD).hardnessAndResistance(0.5f).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("ironwood_button")),
                        BlockInit.ironwood_trapdoor = new CustomTrapDoorBlock(CustomTrapDoorBlock.Properties.create(Material.WOOD).hardnessAndResistance(3.0f).harvestTool(ToolType.AXE).notSolid().sound(SoundType.WOOD)).setRegistryName(location("ironwood_trapdoor")),
                        BlockInit.ironwood_door = new CustomDoorBlock(CustomDoorBlock.Properties.create(Material.WOOD).hardnessAndResistance(3.0f, 5.0f).harvestTool(ToolType.AXE).notSolid().sound(SoundType.WOOD)).setRegistryName(location("ironwood_door")),

                        BlockInit.olive_log = new LogBlock(MaterialColor.WOOD, LogBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.0f, 3.0f).harvestTool(ToolType.AXE).harvestLevel(0).sound(SoundType.WOOD)).setRegistryName(location("olive_log")),
                        BlockInit.stripped_olive_log = new LogBlock(MaterialColor.WOOD, LogBlock.Properties.from(BlockInit.olive_log)).setRegistryName(location("stripped_olive_log")),
                        BlockInit.olive_leaves = new LeavesBlock(LeavesBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2f).tickRandomly().sound(SoundType.PLANT).notSolid()).setRegistryName(location("olive_leaves")),
                        BlockInit.olive_sapling = new CustomSaplingBlock(OliveTree::new, CustomSaplingBlock.Properties.create(Material.PLANTS).hardnessAndResistance(0.0f).tickRandomly().doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName(location("olive_sapling")),
                        BlockInit.potted_olive_sapling = new FlowerPotBlock(BlockInit.olive_sapling, FlowerPotBlock.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).sound(SoundType.STONE)).setRegistryName(location("potted_olive_sapling")),
                        BlockInit.olive_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0f).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("olive_planks")),
                        BlockInit.stripped_olive_wood = new RotatedPillarBlock(RotatedPillarBlock.Properties.from(BlockInit.olive_log)).setRegistryName(location("stripped_olive_wood")),
                        BlockInit.olive_wood = new RotatedPillarBlock(RotatedPillarBlock.Properties.from(BlockInit.olive_log)).setRegistryName(location("olive_wood")),
                        BlockInit.olive_slab = new SlabBlock(SlabBlock.Properties.from(BlockInit.olive_planks)).setRegistryName(location("olive_slab")),
                        BlockInit.olive_stairs = new StairsBlock(() -> BlockInit.olive_planks.getDefaultState(), StairsBlock.Properties.from(BlockInit.olive_planks)).setRegistryName(location("olive_stairs")),
                        BlockInit.olive_fence = new FenceBlock(FenceBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.0f, 3.0f).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("olive_fence")),
                        BlockInit.olive_fence_gate = new FenceGateBlock(FenceGateBlock.Properties.from(BlockInit.olive_fence)).setRegistryName(location("olive_fence_gate")),
                        BlockInit.olive_pressure_plate = new CustomPressurePlateBlock(CustomPressurePlateBlock.Sensitivity.EVERYTHING, CustomPressurePlateBlock.Properties.create(Material.WOOD).hardnessAndResistance(0.5f).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("olive_pressure_plate")),
                        BlockInit.olive_button = new CustomWoodButtonBlock(CustomWoodButtonBlock.Properties.create(Material.WOOD).hardnessAndResistance(0.5f).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("olive_button")),
                        BlockInit.olive_trapdoor = new CustomTrapDoorBlock(CustomTrapDoorBlock.Properties.create(Material.WOOD).hardnessAndResistance(3.0f).harvestTool(ToolType.AXE).notSolid().sound(SoundType.WOOD)).setRegistryName(location("olive_trapdoor")),
                        BlockInit.olive_door = new CustomDoorBlock(CustomDoorBlock.Properties.create(Material.WOOD).hardnessAndResistance(3.0f, 5.0f).harvestTool(ToolType.AXE).notSolid().sound(SoundType.WOOD)).setRegistryName(location("olive_door"))

                );
        RusticRevived.LOGGER.info("Blocks registered.");
    }

    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(RusticRevived.MODID, name);
    }

}
