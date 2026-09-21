package com.dstwr.player.features.player
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
@Composable fun PlayerScreen(url:String,onBack:()->Unit){val context=LocalContext.current;val player=remember(url){ExoPlayer.Builder(context).build().apply{setMediaItem(MediaItem.fromUri(url));prepare();playWhenReady=true}};DisposableEffect(player){onDispose{player.release()}};Box(Modifier.fillMaxSize().background(Color.Black)){AndroidView(factory={PlayerView(it).apply{this.player=player;layoutParams=FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT)}},Modifier.fillMaxSize());TextButton(onClick=onBack){Text("Back",color=Color.White)}}}
