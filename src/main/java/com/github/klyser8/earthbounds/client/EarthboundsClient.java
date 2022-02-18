package com.github.klyser8.earthbounds.client;

import com.github.klyser8.earthbounds.Earthbounds;
import com.github.klyser8.earthbounds.registry.EarthboundBlocks;
import com.github.klyser8.earthbounds.registry.EarthboundEntities;
import com.github.klyser8.earthbounds.registry.EarthboundParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class EarthboundsClient implements ClientModInitializer {

    /**
     * Registers our Entity's renderer, which provides a model and texture for the entity.
     *
     * Entity Renderers can also manipulate the model before it renders based on
     * entity context (EndermanEntityRenderer#render).
     */
    @Override
    public void onInitializeClient() {
        EarthboundEntities.registerRenderers();
        EarthboundParticles.registerFactories();
        BlockRenderLayerMap.INSTANCE.putBlock(EarthboundBlocks.GLOW_GREASE_SPLAT, RenderLayer.getTranslucent());
    }
}
