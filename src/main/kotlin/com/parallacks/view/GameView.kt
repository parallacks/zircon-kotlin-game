package com.parallacks.view

import org.hexworks.zircon.api.component.ColorTheme
import org.hexworks.zircon.api.grid.TileGrid
import org.hexworks.zircon.api.view.base.BaseView

enum class ViewType{
    LOCATION, DIALOGUE, FIGHT
}

abstract class GameView(grid : TileGrid, theme : ColorTheme) : BaseView(grid, theme) {
}