package com.parallacks.view

import com.parallacks.location.LocationFactory
import org.hexworks.zircon.api.component.ColorTheme
import org.hexworks.zircon.api.grid.TileGrid

object ViewFactory {
    fun getView(type: ViewType, dataKey:String, tileGrid: TileGrid, theme: ColorTheme):GameView{
        return when(type){
            ViewType.LOCATION -> LocationView(tileGrid, theme, LocationFactory.buildLocation(dataKey))
            ViewType.DIALOGUE -> DialogueView(tileGrid, theme)
            ViewType.FIGHT -> FightView(tileGrid, theme)
        }
    }

}