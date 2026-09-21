package com.dstwr.player.core.iptv
import com.dstwr.player.core.model.MediaItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
class PlaylistService(private val repository:PlaylistRepository){
 suspend fun load(url:String):List<MediaItem> = withContext(Dispatchers.IO){repository.loadM3u(url)}
}
