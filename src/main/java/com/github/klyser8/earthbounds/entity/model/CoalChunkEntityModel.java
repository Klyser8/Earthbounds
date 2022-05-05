package com.github.klyser8.earthbounds.entity.model;

import com.github.klyser8.earthbounds.Earthbounds;
import com.github.klyser8.earthbounds.entity.misc.CoalChunkEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CoalChunkEntityModel extends AnimatedGeoModel<CoalChunkEntity> {

    @Override
    public Identifier getModelLocation(CoalChunkEntity object) {
        return new Identifier(Earthbounds.MOD_ID, "geo/misc/coal.geo.json");
    }

    @Override
    public Identifier getTextureLocation(CoalChunkEntity object) {
        return new Identifier(Earthbounds.MOD_ID, "textures/entity/misc/coal.png");
    }

    @Override
    public Identifier getAnimationFileLocation(CoalChunkEntity animatable) {
        return new Identifier(Earthbounds.MOD_ID, "animations/earth.coal_chunk.json");
    }

}
