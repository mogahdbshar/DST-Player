package com.dstwr.player
import android.app.Application
import com.dstwr.player.core.database.DatabaseProvider
class DSTPlayerApplication:Application(){val database by lazy{DatabaseProvider.get(this)}}
