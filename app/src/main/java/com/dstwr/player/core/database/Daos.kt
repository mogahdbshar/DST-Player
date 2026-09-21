package com.dstwr.player.core.database
import androidx.room.*
import kotlinx.coroutines.flow.Flow
@Dao interface PlaylistDao{ @Query("SELECT * FROM playlists ORDER BY createdAt DESC") fun observeAll():Flow<List<PlaylistEntity>>; @Insert suspend fun insert(item:PlaylistEntity):Long; @Delete suspend fun delete(item:PlaylistEntity) }
@Dao interface FavoriteDao{ @Query("SELECT * FROM favorites ORDER BY addedAt DESC") fun observeAll():Flow<List<FavoriteEntity>>; @Query("SELECT EXISTS(SELECT 1 FROM favorites WHERE mediaId=:id)") fun observe(id:String):Flow<Boolean>; @Insert(onConflict=OnConflictStrategy.REPLACE) suspend fun upsert(item:FavoriteEntity); @Query("DELETE FROM favorites WHERE mediaId=:id") suspend fun delete(id:String) }
@Dao interface HistoryDao{ @Query("SELECT * FROM history ORDER BY updatedAt DESC") fun observeAll():Flow<List<HistoryEntity>>; @Insert(onConflict=OnConflictStrategy.REPLACE) suspend fun upsert(item:HistoryEntity); @Query("DELETE FROM history") suspend fun clear() }
