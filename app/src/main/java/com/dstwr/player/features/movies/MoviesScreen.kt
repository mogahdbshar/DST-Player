package com.dstwr.player.features.movies
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dstwr.player.core.designsystem.GlassCard
import com.dstwr.player.core.model.MediaItem
@Composable fun MoviesScreen(movies:List<MediaItem>,onOpen:(MediaItem)->Unit){Column(Modifier.fillMaxSize().padding(20.dp)){Text("Movies",style=MaterialTheme.typography.headlineMedium);Spacer(Modifier.height(16.dp));LazyColumn(verticalArrangement=Arrangement.spacedBy(10.dp)){items(movies){m->GlassCard(Modifier.fillMaxWidth()){Row(Modifier.fillMaxWidth().padding(14.dp),horizontalArrangement=Arrangement.SpaceBetween){Text(m.title);Button({onOpen(m)}){Text("Open")}}}}}}}}
