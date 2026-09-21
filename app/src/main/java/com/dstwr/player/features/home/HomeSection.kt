package com.dstwr.player.features.home
data class HomeSection(val title:String,val type:SectionType)
enum class SectionType{FEATURED,LIVE,MOVIES,SERIES,CONTINUE,FAVORITES,RECENT}
