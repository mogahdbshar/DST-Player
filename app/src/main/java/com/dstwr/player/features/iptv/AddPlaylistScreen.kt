package com.dstwr.player.features.iptv

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable fun AddPlaylistScreen(onSaved:(String)->Unit){var name by remember{mutableStateOf("")};var url by remember{mutableStateOf("")};Column(Modifier.fillMaxSize().padding(20.dp)){Text("Add IPTV Playlist",style=MaterialTheme.typography.headlineMedium);Spacer(Modifier.height(20.dp));OutlinedTextField(name,{name=it},Modifier.fillMaxWidth(),label={Text("Playlist name")});Spacer(Modifier.height(12.dp));OutlinedTextField(url,{url=it},Modifier.fillMaxWidth(),label={Text("M3U URL")});Spacer(Modifier.height(20.dp));Button(enabled=name.isNotBlank()&&url.isNotBlank(),onClick={onSaved(url)}){Text("Save playlist")}}}
