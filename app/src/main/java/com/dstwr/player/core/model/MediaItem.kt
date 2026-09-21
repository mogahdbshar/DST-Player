package com.dstwr.player.core.model
data class MediaItem(val id:String,val title:String,val url:String,val posterUrl:String?=null,val group:String?=null,val type:MediaType=MediaType.VIDEO)
enum class MediaType { LIVE,MOVIE,SERIES,EPISODE,AUDIO,VIDEO }
