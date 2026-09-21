package com.dstwr.player.core.iptv
object XtreamUrl{fun live(server:String,user:String,password:String,id:String)=server.trimEnd('/')+"/live/$user/$password/$id.ts";fun vod(server:String,user:String,password:String,id:String)=server.trimEnd('/')+"/movie/$user/$password/$id.mp4";fun series(server:String,user:String,password:String,id:String)=server.trimEnd('/')+"/series/$user/$password/$id.mp4"}
