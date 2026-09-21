package com.dstwr.player.features.favorites
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dstwr.player.features.empty.NoFavorites
@Composable fun FavoritesScreen(){Column(Modifier.fillMaxSize().padding(20.dp)){Text("Favorites",style=MaterialTheme.typography.headlineMedium);Spacer(Modifier.height(20.dp));NoFavorites{}}}
