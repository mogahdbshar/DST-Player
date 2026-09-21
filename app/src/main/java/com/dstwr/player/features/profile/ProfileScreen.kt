package com.dstwr.player.features.profile
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable fun ProfileScreen(){Column(Modifier.fillMaxSize().padding(20.dp)){Text("Profile",style=MaterialTheme.typography.headlineMedium);Spacer(Modifier.height(20.dp));Text("Guest mode");Text("DST Player account preferences")}}
