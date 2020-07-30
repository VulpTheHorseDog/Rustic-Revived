package com.vulp.rusticrevived.client.rendering;

import com.vulp.rusticrevived.init.BlockInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BlockRenderHandler {

    public static void blockRenders() {
        RenderTypeLookup.setRenderLayer(BlockInit.ironwood_door, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.olive_door, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ironwood_leaves, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.olive_leaves, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ironwood_sapling, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.olive_sapling, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ironwood_trapdoor, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.olive_trapdoor, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.potted_ironwood_sapling, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.potted_olive_sapling, RenderType.getCutout());
    }

}
