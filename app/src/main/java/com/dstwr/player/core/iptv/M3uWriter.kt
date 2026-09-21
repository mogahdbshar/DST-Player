package com.dstwr.player.core.iptv
import com.dstwr.player.core.model.MediaItem
object M3uWriter{fun write(items:List<MediaItem>):String=buildString{appendLine("#EXTM3U");items.forEach{item->appendLine("#EXTINF:-1 group-title=\"${item.group.orEmpty()}\",${item.title}");appendLine(item.url)}}}
