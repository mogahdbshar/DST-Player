package com.dstwr.player.core.designsystem
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dstwr.player.core.model.MediaItem

@Composable
fun NeonButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(containerColor = DSTColors.Purple)
    ) { Text(text) }
}

@Composable
fun MediaCard(item: MediaItem, onClick: () -> Unit) {
    GlassCard(
        modifier = Modifier.width(160.dp).clickable(onClick = onClick)
    ) {
        Text(item.title, maxLines = 2)
        Spacer(Modifier.height(6.dp))
        Text(
            item.group.orEmpty(),
            style = MaterialTheme.typography.labelSmall,
            color = DSTColors.Cyan
        )
    }
}
