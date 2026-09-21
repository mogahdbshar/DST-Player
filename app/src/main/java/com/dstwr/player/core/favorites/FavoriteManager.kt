package com.dstwr.player.core.favorites
import com.dstwr.player.core.database.FavoriteDao
import com.dstwr.player.core.database.FavoriteEntity
import com.dstwr.player.core.model.MediaItem
class FavoriteManager(private val dao:FavoriteDao){suspend fun add(item:MediaItem)=dao.upsert(FavoriteEntity(item.id,item.title,item.url,item.type.name,item.posterUrl));suspend fun remove(id:String)=dao.delete(id)}
