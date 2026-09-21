package com.dstwr.player.core.iptv
import com.dstwr.player.core.model.MediaItem
import com.dstwr.player.core.model.MediaType

object M3uParser{
 fun parse(text:String):List<MediaItem>{
  val lines=text.lines().map(String::trim).filter(String::isNotBlank);val out=mutableListOf<MediaItem>();var info:String?=null
  for(line in lines){if(line.startsWith("#EXTINF",true)){info=line}else if(!line.startsWith("#")&&info!=null){val title=info.substringAfterLast(",").trim().ifBlank{"Channel"};val group=Regex("""group-title="([^"]*)"""",RegexOption.IGNORE_CASE).find(info)?.groupValues?.getOrNull(1);val logo=Regex("""tvg-logo="([^"]*)"""",RegexOption.IGNORE_CASE).find(info)?.groupValues?.getOrNull(1);out+=MediaItem(java.util.UUID.randomUUID().toString(),title,line,logo,group,MediaType.LIVE);info=null}}
  return out
 }
}
