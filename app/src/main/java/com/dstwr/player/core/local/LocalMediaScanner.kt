package com.dstwr.player.core.local
import android.content.ContentResolver
import android.provider.MediaStore
import com.dstwr.player.core.model.MediaItem
import com.dstwr.player.core.model.MediaType
fun scanVideos(resolver:ContentResolver):List<MediaItem>{val out=mutableListOf<MediaItem>();resolver.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI,arrayOf(MediaStore.Video.Media._ID,MediaStore.Video.Media.DISPLAY_NAME,MediaStore.Video.Media.DATA),null,null,null)?.use{c->val id=c.getColumnIndexOrThrow(MediaStore.Video.Media._ID);val name=c.getColumnIndexOrThrow(MediaStore.Video.Media.DISPLAY_NAME);val data=c.getColumnIndexOrThrow(MediaStore.Video.Media.DATA);while(c.moveToNext())out+=MediaItem(c.getLong(id).toString(),c.getString(name),c.getString(data),type=MediaType.VIDEO)};return out}
