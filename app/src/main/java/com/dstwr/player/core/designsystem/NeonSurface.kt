package com.dstwr.player.core.designsystem
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp

@Composable
fun NeonSurface(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) {
    Box(
        modifier = modifier.background(
            Brush.linearGradient(listOf(DSTColors.SurfaceElevated, DSTColors.Surface)),
            RoundedCornerShape(22.dp)
        ),
        content = content
    )
}
