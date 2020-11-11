package com.parallacks.location

import com.parallacks.menu.Menu
import com.parallacks.menu.Option
import com.parallacks.view.ViewType
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

object LocationFactory {

    val locationMap : HashMap<String, Location> = HashMap<String, Location>()
    init{
        locationMap["STARTROOM"] = Location("StartRoom", "You wake up in a strange bed you don't recognize. A cat mews in the corner of the room. You heard a bustle of noise outside."
                , Menu(ArrayList(listOf(Option("Go check out the noise", ViewType.LOCATION, "RETRATSINN", "none", "none")))))
        locationMap["RETRATSINN"] = Location("Retrats Inn", "You rub your eyes and get up. You put on the meager clothes you find on a table nearby and head out the door. You're greeted by the view of a small tavern"
                ,Menu(ArrayList(listOf(Option("Go up to the bartender", ViewType.DIALOGUE, "RETRATSBARKEEP", "none", "none"),
                                        Option("Walk outside to take a look around", ViewType.LOCATION, "RETRATSTOWN", "none", "none")))))
        locationMap["RETRATSTOWN"] = Location("Retrats Town", "You step outside and into a brisk wind. From the awning of the building you can see various buildings and people walking around"
                ,Menu(ArrayList(listOf(Option("Go to the Inn", ViewType.LOCATION, "RETRATSINN", "none", "none")))))
    }




    fun buildLocation(dataKey:String):Location?{
        return locationMap[dataKey]
    }
}