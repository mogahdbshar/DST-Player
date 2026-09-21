package com.dstwr.player.core.iptv
data class XtreamCredentials(val server:String,val username:String,val password:String)
data class XtreamEndpoint(val credentials:XtreamCredentials){val base get()=credentials.server.trimEnd('/')}
