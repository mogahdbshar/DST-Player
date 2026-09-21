package com.dstwr.player.features.dashboard
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
@Composable fun DashboardScreen(nav:NavController){ Column(Modifier.fillMaxSize().padding(20.dp)){ Text("DST Player",style=MaterialTheme.typography.headlineMedium); Spacer(Modifier.height(12.dp)); Text("Your media, your way",color=MaterialTheme.colorScheme.secondary); Spacer(Modifier.height(24.dp)); Text("Live Channels"); Spacer(Modifier.height(12.dp)); Row(horizontalArrangement=Arrangement.spacedBy(12.dp)){ Button({nav.navigate("live")}){Text("Live")}; Button({nav.navigate("movies")}){Text("Movies")} } } }
