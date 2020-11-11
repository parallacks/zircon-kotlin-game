package com.parallacks.view.fragment

import org.hexworks.zircon.api.ComponentDecorations
import org.hexworks.zircon.api.Components
import org.hexworks.zircon.api.component.ComponentAlignment
import org.hexworks.zircon.api.component.Panel
import org.hexworks.zircon.api.component.renderer.ComponentDecorationRenderer
import org.hexworks.zircon.api.graphics.BoxType
import org.hexworks.zircon.api.screen.Screen

class DescriptionFragment(val width:Int, val height: Int,
                          val text:String, val screen:Screen,
                          val decoration: ComponentDecorationRenderer = ComponentDecorations.box(BoxType.SINGLE),
                          val alignment: ComponentAlignment = ComponentAlignment.TOP_RIGHT) {
    fun build(): Panel {
        val panel = Components.panel()
                .withSize(width, height)
                .withDecorations(decoration)
                .withAlignmentWithin(screen, alignment)
                .build()
        val para = Components.paragraph()
                .withText(text)
                .withSize(width-3, height-3)
                .build()
        val box = Components.textBox(para.width)
                .addParagraph(para)
                .build()
        panel.addComponent(box)
        return panel
    }
}