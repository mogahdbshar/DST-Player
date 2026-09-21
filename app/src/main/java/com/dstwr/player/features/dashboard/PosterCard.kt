package com.dstwr.player.features.dashboard
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dstwr.player.core.model.MediaItem
@Composable fun PosterCard(item:MediaItem,onClick:()->Unit){
 Card(onClick=onClick,modifier=Modifier.width(180.dp)){Column(Modifier.padding(14.dp)){Text(item.title,maxLines=2);Spacer(Modifier.height(6.dp));Text(item.group.orEmpty(),style=MaterialTheme.typography.labelSmall)}}}
