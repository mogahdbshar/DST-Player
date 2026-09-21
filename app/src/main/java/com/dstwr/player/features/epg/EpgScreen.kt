package com.dstwr.player.features.epg

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dstwr.player.core.model.Program

@Composable fun EpgScreen(programs:List<Program>){Column(Modifier.fillMaxSize().padding(20.dp)){Text("TV Guide",style=MaterialTheme.typography.headlineMedium);Spacer(Modifier.height(16.dp));LazyColumn(verticalArrangement=Arrangement.spacedBy(8.dp)){items(programs){p->ListItem(headlineContent={Text(p.title)},supportingContent={Text(p.description.orEmpty())})}}}}
