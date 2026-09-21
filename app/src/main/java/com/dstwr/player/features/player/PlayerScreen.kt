package com.dstwr.player.features.player
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dstwr.player.core.designsystem.DSTColors

@Composable fun PlayerScreen(url:String,title:String="DST Player"){
 Column(Modifier.fillMaxSize().padding(12.dp)){
  Text(title,style=MaterialTheme.typography.titleLarge,color=DSTColors.TextPrimary)
  Spacer(Modifier.height(12.dp))
  Surface(Modifier.fillMaxWidth().weight(1f),color=androidx.compose.ui.graphics.Color.Black){Box(Modifier.fillMaxSize())}
  PlayerControls(0,0,false,{}, {}, {})
 }
}
