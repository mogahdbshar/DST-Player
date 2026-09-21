package com.dstwr.player.core.model

data class Program(val id:String,val channelId:String,val title:String,val description:String?,val startEpochMs:Long,val endEpochMs:Long,val posterUrl:String?=null)
