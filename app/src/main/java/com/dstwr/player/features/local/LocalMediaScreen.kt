package com.dstwr.player.features.local
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable fun LocalMediaScreen(){Column(Modifier.fillMaxSize().padding(20.dp)){Text("Local Files",style=MaterialTheme.typography.headlineMedium);Spacer(Modifier.height(12.dp));Text("Video and audio from this device will appear here.")}}
