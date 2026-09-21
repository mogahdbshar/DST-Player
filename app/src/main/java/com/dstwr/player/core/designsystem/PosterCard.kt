package com.dstwr.player.core.designsystem
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dstwr.player.core.model.MediaItem
@Composable fun PosterCard(item:MediaItem,onClick:()->Unit){GlassCard(Modifier.width(150.dp).clickable(onClick=onClick)){Column(Modifier.padding(14.dp)){Text(item.title,maxLines=2);Text(item.group.orEmpty(),style=androidx.compose.material3.MaterialTheme.typography.labelSmall,color=DSTColors.Cyan)}}}
