package com.dstwr.player.core.database
import androidx.room.Database
import androidx.room.RoomDatabase
@Database(entities=[PlaylistEntity::class,FavoriteEntity::class,HistoryEntity::class],version=1,exportSchema=false)
abstract class DSTPlayerDatabase:RoomDatabase(){abstract fun playlistDao():PlaylistDao;abstract fun favoriteDao():FavoriteDao;abstract fun historyDao():HistoryDao}
