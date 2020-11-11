package com.parallacks

import com.parallacks.view.StartView
import org.hexworks.zircon.api.CP437TilesetResources
import org.hexworks.zircon.api.ColorThemes
import org.hexworks.zircon.api.Components
import org.hexworks.zircon.api.SwingApplications
import org.hexworks.zircon.api.application.AppConfig
import org.hexworks.zircon.api.extensions.toScreen

fun main(args: Array<String>) {
    val tileGrid = SwingApplications.startTileGrid(
            AppConfig.newBuilder()
                    .withSize(120, 63)
                    .withDefaultTileset(CP437TilesetResources.rexPaint16x16())
                    .build())

    val screen = tileGrid.toScreen()
    val theme = ColorThemes.defaultTheme()
    StartView(tileGrid, theme).dock()
}
