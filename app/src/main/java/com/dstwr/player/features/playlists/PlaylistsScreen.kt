package com.dstwr.player.features.playlists
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable fun PlaylistsScreen(onAdd:()->Unit){Column(Modifier.fillMaxSize().padding(20.dp)){Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween){Text("Playlists",style=MaterialTheme.typography.headlineMedium);Button(onClick=onAdd){Text("Add")}};Spacer(Modifier.height(20.dp));Text("No playlists added yet.")}}
