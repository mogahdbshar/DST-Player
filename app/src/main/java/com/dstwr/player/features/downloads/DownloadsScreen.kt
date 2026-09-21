package com.dstwr.player.features.downloads
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dstwr.player.features.empty.NoDownloads
@Composable fun DownloadsScreen(){Column(Modifier.fillMaxSize().padding(20.dp)){Text("Downloads",style=MaterialTheme.typography.headlineMedium);Spacer(Modifier.height(20.dp));NoDownloads()}}
