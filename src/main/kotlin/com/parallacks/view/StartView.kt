package com.parallacks.view

import org.hexworks.zircon.api.ComponentDecorations
import org.hexworks.zircon.api.Components
import org.hexworks.zircon.api.component.ColorTheme
import org.hexworks.zircon.api.component.ComponentAlignment
import org.hexworks.zircon.api.graphics.BoxType
import org.hexworks.zircon.api.grid.TileGrid
import org.hexworks.zircon.api.uievent.ComponentEventType.*


class StartView(grid : TileGrid, theme : ColorTheme) : GameView(grid, theme) {
    init {
        val msg = "Welcome to Avaj"
        val title = Components.textBox(msg.length)
                .addHeader(msg)
                .addNewLine()
                .withAlignmentWithin(screen, ComponentAlignment.CENTER)
                .build()
        val button = Components.button()
                .withAlignmentAround(title, ComponentAlignment.BOTTOM_CENTER)
                .withText("Start")
                .withDecorations(ComponentDecorations.box(BoxType.TOP_BOTTOM_DOUBLE))
                .build()
        screen.addComponent(title)
        screen.addComponent(button)
        button.processComponentEvents(ACTIVATED){
            ViewFactory.getView(ViewType.LOCATION, "STARTROOM", grid, theme).dock()
        }
    }

}