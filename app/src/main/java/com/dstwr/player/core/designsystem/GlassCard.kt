package com.dstwr.player.core.designsystem
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp

@Composable
fun GlassCard(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) {
    Box(
        modifier = modifier
            .background(
                Brush.linearGradient(
                    listOf(DSTColors.SurfaceElevated, DSTColors.Surface)
                ),
                RoundedCornerShape(20.dp)
            )
            .border(
                1.dp,
                DSTColors.Purple.copy(alpha = .24f),
                RoundedCornerShape(20.dp)
            ),
        content = content
    )
}
