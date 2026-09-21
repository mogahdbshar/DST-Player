package com.dstwr.player.core.storage

import android.content.Context
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class Preferences(context:Context){
 private val prefs=context.getSharedPreferences("dst_player",Context.MODE_PRIVATE)
 private val _language=MutableStateFlow(prefs.getString("language","ar") ?: "ar")
 val language:StateFlow<String> = _language
 fun setLanguage(value:String){prefs.edit().putString("language",value).apply();_language.value=value}
}
