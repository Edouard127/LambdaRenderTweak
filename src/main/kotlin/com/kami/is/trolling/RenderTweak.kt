package com.kami.`is`.trolling

import com.lambda.client.plugin.api.Plugin
import com.kami.`is`.trolling.modules.Tweak

internal object RenderTweak : Plugin() {

    override fun onLoad() {
        // Load any modules, commands, or HUD elements here
        modules.add(Tweak)
    }

    override fun onUnload() {

    }
}