package com.dstwr.player.core.network
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
fun isNetworkAvailable(context:Context):Boolean{val cm=context.getSystemService(ConnectivityManager::class.java);return cm?.activeNetwork?.let{cm.getNetworkCapabilities(it)?.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)}==true}
