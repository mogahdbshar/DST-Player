package com.dstwr.player.features.settings
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable fun SettingsScreen(){Column(Modifier.fillMaxSize().padding(20.dp)){Text("Settings",style=MaterialTheme.typography.headlineMedium);Spacer(Modifier.height(16.dp));PlaybackSettings();Spacer(Modifier.height(16.dp));Text("DST Player",style=MaterialTheme.typography.titleMedium);Text("Version 1.0.0")}}
