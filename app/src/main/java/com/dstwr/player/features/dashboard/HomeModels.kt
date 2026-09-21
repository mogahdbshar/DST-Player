package com.dstwr.player.features.dashboard
enum class SectionType { FEATURED, CONTINUE, LIVE, MOVIES, SERIES }
data class HomeSection(val title:String,val type:SectionType)
