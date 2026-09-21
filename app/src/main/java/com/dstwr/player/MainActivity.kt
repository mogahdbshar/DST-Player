package com.dstwr.player

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.dstwr.player.core.designsystem.DSTPlayerTheme
import com.dstwr.player.navigation.DSTPlayerNavHost

class MainActivity : ComponentActivity() {
 override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); setContent { DSTPlayerTheme { Surface { DSTPlayerNavHost() } } } }
}
