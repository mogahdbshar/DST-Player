package com.dstwr.player.core.database

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName="playlists") data class PlaylistEntity(@PrimaryKey(autoGenerate=true) val id:Long=0,val name:String,val url:String,val type:String,val createdAt:Long=System.currentTimeMillis())
@Entity(tableName="favorites") data class FavoriteEntity(@PrimaryKey val mediaId:String,val title:String,val url:String,val type:String,val posterUrl:String?=null,val addedAt:Long=System.currentTimeMillis())
@Entity(tableName="history") data class HistoryEntity(@PrimaryKey val mediaId:String,val title:String,val url:String,val positionMs:Long,val durationMs:Long,val updatedAt:Long=System.currentTimeMillis())
