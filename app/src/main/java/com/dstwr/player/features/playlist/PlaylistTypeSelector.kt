package com.dstwr.player.features.playlist
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dstwr.player.core.model.PlaylistType
@Composable fun PlaylistTypeSelector(selected:PlaylistType,onSelect:(PlaylistType)->Unit){Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.spacedBy(8.dp)){PlaylistType.values().forEach{type->FilterChip(selected==type,{onSelect(type)},label={Text(type.name)})}}}
