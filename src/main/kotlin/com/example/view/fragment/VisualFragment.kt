package com.example.view.fragment

import org.hexworks.zircon.api.ComponentDecorations
import org.hexworks.zircon.api.Components
import org.hexworks.zircon.api.component.Panel
import org.hexworks.zircon.api.graphics.BoxType

class VisualFragment(var width: Int, var height: Int) {

    fun buildFragment(): Panel {
        val panel = Components.panel()
                .withSize(width, height)
                .withDecorations(ComponentDecorations.box(BoxType.SINGLE))
                .build();
        return panel;
    }
}