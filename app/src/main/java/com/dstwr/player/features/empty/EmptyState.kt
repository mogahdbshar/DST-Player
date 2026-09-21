package com.dstwr.player.features.empty
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable fun EmptyState(title:String,message:String,actionLabel:String?=null,onAction:(()->Unit)?=null){Box(Modifier.fillMaxWidth().padding(28.dp),contentAlignment=Alignment.Center){Column(horizontalAlignment=Alignment.CenterHorizontally){Text(title,style=MaterialTheme.typography.titleLarge);Spacer(Modifier.height(8.dp));Text(message,color=MaterialTheme.colorScheme.onSurfaceVariant);if(actionLabel!=null&&onAction!=null){Spacer(Modifier.height(16.dp));Button(onClick=onAction){Text(actionLabel)}}}}}
