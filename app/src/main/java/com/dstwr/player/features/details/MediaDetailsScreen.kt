package com.dstwr.player.features.details
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dstwr.player.core.model.MediaItem
@Composable fun MediaDetailsScreen(item:MediaItem,onPlay:()->Unit){Column(Modifier.fillMaxSize().padding(20.dp)){Text(item.title,style=MaterialTheme.typography.headlineMedium);Text(item.group.orEmpty(),color=MaterialTheme.colorScheme.secondary);Spacer(Modifier.height(20.dp));Button(onClick=onPlay){Text("Play")};TextButton(onClick={}){Text("Add to Favorites")}}}
