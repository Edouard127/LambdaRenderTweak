package com.lambda.mixins.accessor;

import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import java.util.Map;

@Mixin(TextureManager.class)
public interface AccessorTextureManager {

    @Accessor("mapTextureObjects")
    Map<ResourceLocation, ITextureObject> getMapTextureObjects();
}

