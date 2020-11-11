package com.parallacks.menu

import com.parallacks.view.ViewType

data class Option(val label:String, val type: ViewType, val dataKey:String, val condition:String, val result:String)