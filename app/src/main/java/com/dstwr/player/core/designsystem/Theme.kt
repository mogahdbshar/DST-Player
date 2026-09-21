package com.dstwr.player.core.designsystem

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val Dark = darkColorScheme(primary=Color(0xFF6C2BFF), secondary=Color(0xFF00F0FF), background=Color(0xFF05060F), surface=Color(0xFF0B0D1B), onBackground=Color.White, onSurface=Color.White)
@Composable fun DSTPlayerTheme(content:@Composable()->Unit){ MaterialTheme(colorScheme=Dark, content=content) }
