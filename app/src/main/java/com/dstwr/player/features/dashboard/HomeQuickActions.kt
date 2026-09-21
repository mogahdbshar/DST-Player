package com.dstwr.player.features.dashboard
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable fun HomeQuickActions(onLive:()->Unit,onMovies:()->Unit,onSeries:()->Unit,onSearch:()->Unit){Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.spacedBy(8.dp)){Button(onClick=onLive){Text("Live")};Button(onClick=onMovies){Text("Movies")};Button(onClick=onSeries){Text("Series")};Button(onClick=onSearch){Text("Search")}}}
