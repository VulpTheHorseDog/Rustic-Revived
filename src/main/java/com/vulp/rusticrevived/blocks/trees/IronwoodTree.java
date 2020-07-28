package com.vulp.rusticrevived.blocks.trees;

import com.vulp.rusticrevived.init.FeatureInit;
import net.minecraft.block.trees.OakTree;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class IronwoodTree extends OakTree {

    public IronwoodTree() {

    }

    @Nullable
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean p_225546_2_) {
        return Feature.NORMAL_TREE.withConfiguration(FeatureInit.ironwood_tree_feature);
    }

}
