package com.dstwr.player.features.search

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable fun SearchScreen(){var query by remember{mutableStateOf("")};Column(Modifier.fillMaxSize().padding(20.dp)){Text("Search",style=MaterialTheme.typography.headlineMedium);Spacer(Modifier.height(16.dp));OutlinedTextField(query,{query=it},Modifier.fillMaxWidth(),singleLine=true,label={Text("Search media")});Spacer(Modifier.height(24.dp));Text(if(query.isBlank()) "Search your channels, movies and series" else "No results yet")}}
