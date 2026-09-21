package com.dstwr.player.core.iptv
import com.dstwr.player.core.model.MediaItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.HttpURLConnection
import java.net.URL
class PlaylistRepository{
 suspend fun loadM3u(url:String):List<MediaItem>=withContext(Dispatchers.IO){
  val c=URL(url).openConnection() as HttpURLConnection;c.connectTimeout=15000;c.readTimeout=20000;c.requestMethod="GET";c.inputStream.bufferedReader().use{M3uParser.parse(it.readText())}.also{c.disconnect()}
 }
}
