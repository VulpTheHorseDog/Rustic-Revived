package com.vulp.rusticrevived.blocks;

import net.minecraft.block.SaplingBlock;
import net.minecraft.block.trees.Tree;

import java.util.function.Supplier;

public class CustomSaplingBlock extends SaplingBlock {

    public CustomSaplingBlock(Supplier<Tree> treeIn, Properties properties) {
        super(treeIn.get(), properties);
    }

}
