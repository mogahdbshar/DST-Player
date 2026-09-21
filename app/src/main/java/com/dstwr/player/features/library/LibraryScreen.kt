package com.dstwr.player.features.library
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable fun LibraryScreen(){Column(Modifier.fillMaxSize().padding(20.dp)){Text("Library",style=MaterialTheme.typography.headlineMedium);Spacer(Modifier.height(16.dp));Text("Favorites, history, playlists and local media")}}
