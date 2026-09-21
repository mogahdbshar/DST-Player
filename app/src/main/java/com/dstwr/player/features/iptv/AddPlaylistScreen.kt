package com.dstwr.player.features.iptv
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dstwr.player.core.iptv.PlaylistRepository
import com.dstwr.player.core.utils.UrlValidator
import kotlinx.coroutines.launch
@Composable fun AddPlaylistScreen(onSaved:()->Unit){
 var name by remember{mutableStateOf("")};var url by remember{mutableStateOf("")};var error by remember{mutableStateOf<String?>(null)};val scope=rememberCoroutineScope()
 Column(Modifier.fillMaxSize().padding(20.dp)){Text("Add IPTV Playlist",style=MaterialTheme.typography.headlineMedium);Spacer(Modifier.height(16.dp));OutlinedTextField(name,{name=it},Modifier.fillMaxWidth(),label={Text("Playlist name")});Spacer(Modifier.height(12.dp));OutlinedTextField(url,{url=it},Modifier.fillMaxWidth(),label={Text("M3U URL")},singleLine=true);error?.let{Text(it,color=MaterialTheme.colorScheme.error)};Spacer(Modifier.height(18.dp));Button(onClick={if(!UrlValidator.isHttp(url))error="Enter a valid HTTP/HTTPS URL" else scope.launch{runCatching{PlaylistRepository().loadM3u(url)}.onSuccess{onSaved()}.onFailure{error=it.message?:"Unable to load playlist"}}},enabled=name.isNotBlank()&&url.isNotBlank()){Text("Load Playlist")}}
}
