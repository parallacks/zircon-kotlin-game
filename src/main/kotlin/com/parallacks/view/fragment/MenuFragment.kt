package com.parallacks.view.fragment

import com.parallacks.menu.Menu
import com.parallacks.menu.Option
import com.parallacks.view.ViewFactory
import org.hexworks.zircon.api.ComponentDecorations
import org.hexworks.zircon.api.Components
import org.hexworks.zircon.api.component.ColorTheme
import org.hexworks.zircon.api.component.ComponentAlignment
import org.hexworks.zircon.api.component.Panel
import org.hexworks.zircon.api.extensions.toScreen
import org.hexworks.zircon.api.graphics.BoxType
import org.hexworks.zircon.api.grid.TileGrid
import org.hexworks.zircon.api.uievent.ComponentEventType.*

class MenuFragment(val width: Int, val height: Int,
                   val menu: Menu, val tileGrid: TileGrid,
                   val theme:ColorTheme,
                   val alignment: ComponentAlignment = ComponentAlignment.BOTTOM_LEFT) {

    fun build(): Panel {
        val menuPanel = Components.panel()
                .withSize(width, height)
                .withDecorations(ComponentDecorations.box(BoxType.SINGLE))
                .withAlignmentWithin(tileGrid.toScreen(), alignment)
                .build();
        val organize = Components.vbox()
                .withSpacing(1)
                .withSize(width-4, height-4)
                .build();
        menuPanel.addComponent(organize)
        for(op: Option in menu.options){
            val b = Components.button().withText(op.label).build()
            b.processComponentEvents(ACTIVATED){
                ViewFactory.getView(op.type, op.dataKey, tileGrid, theme).dock()
            }
            organize.addComponent(b)
        }
        return menuPanel
    }
}