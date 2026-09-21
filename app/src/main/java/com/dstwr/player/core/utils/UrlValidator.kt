package com.dstwr.player.core.utils
object UrlValidator{fun isHttp(value:String):Boolean=runCatching{val u=java.net.URI(value);u.scheme=="http"||u.scheme=="https"}.getOrDefault(false);fun isM3u(value:String):Boolean=value.contains(".m3u",true)||value.contains("get.php",true)||value.contains("m3u_plus",true)}
