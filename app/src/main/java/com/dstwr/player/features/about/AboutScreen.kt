package com.dstwr.player.features.about
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable fun AboutScreen(){Column(Modifier.fillMaxSize().padding(20.dp)){Text("About DST Player",style=MaterialTheme.typography.headlineMedium);Spacer(Modifier.height(16.dp));Text("Modern local media and IPTV player.");Text("Version 1.0.0")}}
