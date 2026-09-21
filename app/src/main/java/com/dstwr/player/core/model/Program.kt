package com.dstwr.player.core.model
data class Program(val id:String=java.util.UUID.randomUUID().toString(),val title:String,val description:String?=null,val startTime:Long=0,val endTime:Long=0,val channelId:String?=null)
