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
import com.dstwr.player.core.model.MediaItem
import com.dstwr.player.core.model.MediaType
import com.dstwr.player.core.model.Program
import androidx.navigation.NavHostController

@Composable fun DSTPlayerNavHost(){
 val nav=rememberNavController()
 val channels=listOf(MediaItem("1","News Channel","https://example.com/live",group="News",type=MediaType.LIVE))
 val movies=listOf(MediaItem("2","Movie","https://example.com/movie",group="Movies",type=MediaType.MOVIE))
 NavHost(navController=nav,startDestination=Routes.HOME){
  composable(Routes.HOME){DashboardScreen(nav)}
  composable(Routes.LIVE){LiveChannelsScreen(channels,{nav.navigate("player")})}
  composable(Routes.MOVIES){MoviesScreen(emptyList(),{})}
  composable(Routes.SERIES){SeriesScreen(emptyList(),{})}
  composable(Routes.SEARCH){SearchScreen()}
  composable(Routes.LIBRARY){LibraryScreen()}
  composable(Routes.SETTINGS){SettingsScreen()}
  composable(Routes.EPG){EpgScreen(emptyList<Program>())}
 }
}
