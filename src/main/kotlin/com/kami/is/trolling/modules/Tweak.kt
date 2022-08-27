package com.kami.`is`.trolling.modules

import com.kami.`is`.trolling.RenderTweak
import com.lambda.mixins.accessor.AccessorTextureManager
import com.lambda.client.module.Category
import com.lambda.client.plugin.api.PluginModule
import net.minecraft.client.Minecraft
import net.minecraft.client.renderer.texture.ITextureObject
import net.minecraft.client.renderer.texture.TextureUtil
import net.minecraft.util.ResourceLocation

internal object Tweak : PluginModule(
    name = "RenderTweak",
    category = Category.RENDER,
    description = "Tweak the fuck out of the game",
    pluginMain = RenderTweak
) {
    private val textureManager: Map<ResourceLocation, ITextureObject> = (Minecraft.getMinecraft().textureManager as AccessorTextureManager).mapTextureObjects

    init {
        textureManager.forEach {
            TextureUtil.deleteTexture(it.value.glTextureId)
        }
    }
}