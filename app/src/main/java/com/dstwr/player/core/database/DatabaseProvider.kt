package com.dstwr.player.core.database
import android.content.Context
import androidx.room.Room
object DatabaseProvider{ @Volatile private var instance:DSTPlayerDatabase?=null; fun get(context:Context):DSTPlayerDatabase=instance?:synchronized(this){instance?:Room.databaseBuilder(context.applicationContext,DSTPlayerDatabase::class.java,"dst_player.db").build().also{instance=it}} }
