package com.dstwr.player.core.designsystem
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
@Composable fun NeonDivider(){Box(Modifier.fillMaxWidth().height(1.dp).background(Brush.horizontalGradient(listOf(DSTColors.Purple,DSTColors.Cyan,DSTColors.Purple))))}
