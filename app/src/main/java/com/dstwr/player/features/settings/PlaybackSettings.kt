package com.dstwr.player.features.settings
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable fun PlaybackSettings(){var autoplay by remember{mutableStateOf(true)};var subtitles by remember{mutableStateOf(true)};var rememberPosition by remember{mutableStateOf(true)};Column{Text("Playback",style=MaterialTheme.typography.titleMedium);SettingToggle("Autoplay",autoplay){autoplay=it};SettingToggle("Subtitles",subtitles){subtitles=it};SettingToggle("Remember position",rememberPosition){rememberPosition=it}}}
@Composable private fun SettingToggle(title:String,value:Boolean,onChange:(Boolean)->Unit){Row(Modifier.fillMaxWidth().padding(vertical=4.dp),horizontalArrangement=Arrangement.SpaceBetween){Text(title);Switch(checked=value,onCheckedChange=onChange)}}
