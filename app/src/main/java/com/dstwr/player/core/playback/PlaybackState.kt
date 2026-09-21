package com.dstwr.player.core.playback
data class PlaybackState(val isPlaying:Boolean=false,val positionMs:Long=0,val durationMs:Long=0,val bufferedMs:Long=0,val speed:Float=1f,val error:String?=null)
