package com.dstwr.player.core.model

data class VideoContent(val id:String,val title:String,val overview:String?=null,val posterUrl:String?=null,val backdropUrl:String?=null,val streamUrl:String?=null,val year:Int?=null,val rating:Float?=null,val genres:List<String> = emptyList())
