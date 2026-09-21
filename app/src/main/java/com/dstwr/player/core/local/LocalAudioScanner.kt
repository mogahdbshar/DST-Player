package com.dstwr.player.core.local
import android.content.ContentResolver
import android.provider.MediaStore
import com.dstwr.player.core.model.MediaItem
import com.dstwr.player.core.model.MediaType
fun scanAudio(resolver:ContentResolver):List<MediaItem>{val out=mutableListOf<MediaItem>();resolver.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,arrayOf(MediaStore.Audio.Media._ID,MediaStore.Audio.Media.DISPLAY_NAME,MediaStore.Audio.Media.DATA),MediaStore.Audio.Media.IS_MUSIC+"!=0",null,null)?.use{c->val id=c.getColumnIndexOrThrow(MediaStore.Audio.Media._ID);val name=c.getColumnIndexOrThrow(MediaStore.Audio.Media.DISPLAY_NAME);val data=c.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA);while(c.moveToNext())out+=MediaItem(c.getLong(id).toString(),c.getString(name),c.getString(data),type=MediaType.AUDIO)};return out}
