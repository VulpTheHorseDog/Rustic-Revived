package com.vulp.rusticrevived.init;

import net.minecraft.block.trees.OakTree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

public class FeatureInit {

    public static final TreeFeatureConfig ironwood_tree_feature = new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BlockInit.ironwood_log.getDefaultState()), new SimpleBlockStateProvider(BlockInit.ironwood_leaves.getDefaultState()), new BlobFoliagePlacer(2, 0)).baseHeight(7).heightRandA(6).foliageHeight(3).ignoreVines().setSapling(((IPlantable)BlockInit.ironwood_sapling)).build();
    public static final TreeFeatureConfig olive_tree_feature = new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BlockInit.olive_log.getDefaultState()), new SimpleBlockStateProvider(BlockInit.olive_leaves.getDefaultState()), new BlobFoliagePlacer(2, 0)).baseHeight(4).heightRandA(2).foliageHeight(3).ignoreVines().setSapling(((IPlantable)BlockInit.olive_sapling)).build();

}
