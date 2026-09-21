package com.dstwr.player.core.utils
object TimeFormat{fun duration(ms:Long):String{val total=(ms.coerceAtLeast(0))/1000;return "%d:%02d".format(total/60,total%60)}}
