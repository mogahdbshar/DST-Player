package com.dstwr.player.core.iptv
import com.dstwr.player.core.model.MediaItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.URL
class PlaylistRepository{suspend fun loadM3u(url:String):List<MediaItem>=withContext(Dispatchers.IO){M3uParser.parse(URL(url).readText())}}
