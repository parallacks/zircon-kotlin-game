package com.parallacks.view

import com.parallacks.location.Location
import com.parallacks.view.fragment.DescriptionFragment
import com.parallacks.view.fragment.MenuFragment
import com.parallacks.view.fragment.VisualFragment
import org.hexworks.zircon.api.component.ColorTheme
import org.hexworks.zircon.api.grid.TileGrid

class LocationView(tileGrid: TileGrid, theme: ColorTheme, private val location: Location?) : GameView(tileGrid, theme){
    init{
        if(location != null){
            val visual = VisualFragment((screen.width* .75).toInt(), (screen.height*.666667).toInt()).build()
            val description = DescriptionFragment(screen.width/4, (screen.height*.666667).toInt(), location.description, screen).build()
            val menu = MenuFragment(screen.width, screen.height/3, location.menu, tileGrid, theme).build()
            screen.addComponent(visual)
            screen.addComponent(description)
            screen.addComponent(menu)
        }else{
            println("uhoh")
            StartView(tileGrid, theme)
        }
    }
}