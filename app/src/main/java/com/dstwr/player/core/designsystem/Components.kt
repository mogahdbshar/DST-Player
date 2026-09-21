package com.dstwr.player.core.designsystem
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
@Composable fun GlassCard(modifier:Modifier=Modifier,content:@Composable ColumnScope.()->Unit){Column(modifier.clip(RoundedCornerShape(20.dp)).background(Brush.linearGradient(listOf(Color(0xFF14152A),Color(0xFF0A0B18)))).padding(16.dp),content=content)}
@Composable fun NeonButton(text:String,onClick:()->Unit){Button(onClick,shape=RoundedCornerShape(16.dp),colors=ButtonDefaults.buttonColors(containerColor=Color(0xFF6C2BFF))){Text(text)}}
@Composable fun MediaCard(item:com.dstwr.player.core.model.MediaItem,onClick:()->Unit){GlassCard(Modifier.width(160.dp).clickable(onClick=onClick)){Text(item.title,maxLines=2);Spacer(Modifier.height(6.dp));Text(item.group.orEmpty(),style=MaterialTheme.typography.labelSmall,color=Color(0xFF00F0FF))}}
