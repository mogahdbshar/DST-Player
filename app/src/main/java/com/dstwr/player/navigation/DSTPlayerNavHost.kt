package com.dstwr.player.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.dstwr.player.features.dashboard.DashboardScreen
import com.dstwr.player.features.library.LibraryScreen
import com.dstwr.player.features.search.SearchScreen
import com.dstwr.player.features.settings.SettingsScreen
import com.dstwr.player.features.live.LiveChannelsScreen
import com.dstwr.player.features.movies.MoviesScreen
import com.dstwr.player.features.series.SeriesScreen
import com.dstwr.player.features.epg.EpgScreen
import com.dstwr.player.features.downloads.DownloadsScreen
import com.dstwr.player.features.profile.ProfileScreen
import com.dstwr.player.features.about.AboutScreen
import com.dstwr.player.features.favorites.FavoritesScreen
import com.dstwr.player.features.playlists.PlaylistsScreen
import com.dstwr.player.features.local.LocalMediaScreen
import com.dstwr.player.features.iptv.AddPlaylistScreen
import com.dstwr.player.features.player.PlayerScreen
import com.dstwr.player.core.model.MediaItem
import com.dstwr.player.core.model.MediaType
import com.dstwr.player.core.model.Program

@Composable fun DSTPlayerNavHost(){
 val nav=rememberNavController()
 val channels=listOf(MediaItem("1","News Channel","https://example.com/live",group="News",type=MediaType.LIVE))
 NavHost(navController=nav,startDestination=Routes.HOME){
  composable(Routes.HOME){DashboardScreen(nav)}
  composable(Routes.LIVE){LiveChannelsScreen(channels){nav.navigate(Routes.PLAYER)}}
  composable(Routes.MOVIES){MoviesScreen(emptyList(),{})}
  composable(Routes.SERIES){SeriesScreen(emptyList(),{})}
  composable(Routes.SEARCH){SearchScreen()}
  composable(Routes.LIBRARY){LibraryScreen()}
  composable(Routes.SETTINGS){SettingsScreen()}
  composable(Routes.EPG){EpgScreen(emptyList<Program>())}
  composable(Routes.DOWNLOADS){DownloadsScreen()}
  composable(Routes.PROFILE){ProfileScreen()}
  composable(Routes.ABOUT){AboutScreen()}
  composable(Routes.FAVORITES){FavoritesScreen()}
  composable(Routes.PLAYLISTS){PlaylistsScreen{nav.navigate(Routes.ADD_PLAYLIST)}}
  composable(Routes.ADD_PLAYLIST){AddPlaylistScreen{nav.popBackStack()}}
  composable(Routes.LOCAL){LocalMediaScreen()}
  composable(Routes.PLAYER){PlayerScreen("https://example.com/live","DST Player")}
 }
}