package com.dstwr.player.features.dashboard
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dstwr.player.core.designsystem.*
import com.dstwr.player.core.model.MediaItem
import com.dstwr.player.core.model.MediaType
import com.dstwr.player.navigation.Routes
@Composable fun DashboardScreen(nav:NavController){
 val demo=remember{listOf(MediaItem("1","Live Channels","https://example.com/1",group="News",type=MediaType.LIVE),MediaItem("2","Movies","https://example.com/2",group="Featured",type=MediaType.MOVIE),MediaItem("3","Series","https://example.com/3",group="Drama",type=MediaType.SERIES))}
 Scaffold(bottomBar={DSTBottomBar(Routes.HOME){nav.navigate(it)}},containerColor=DSTColors.Background){pad->
  Column(Modifier.fillMaxSize().padding(pad).padding(horizontal=16.dp,vertical=12.dp)){
   Text("DST Player",style=MaterialTheme.typography.headlineLarge);Text("Your media, your way",color=DSTColors.TextSecondary)
   Spacer(Modifier.height(18.dp));NeonSurface(Modifier.fillMaxWidth().height(190.dp)){Column(Modifier.padding(20.dp)){Text("Featured",color=DSTColors.Cyan,style=MaterialTheme.typography.labelLarge);Spacer(Modifier.height(10.dp));Text("Your entertainment hub",style=MaterialTheme.typography.headlineSmall);Spacer(Modifier.height(18.dp));Button({nav.navigate(Routes.LIVE)}){Text("Explore Live")}}}
   Spacer(Modifier.height(20.dp));HomeQuickActions({nav.navigate(Routes.LIVE)},{nav.navigate(Routes.MOVIES)},{nav.navigate(Routes.SERIES)},{nav.navigate(Routes.SEARCH)})
   Spacer(Modifier.height(22.dp));Text("Continue Watching",style=MaterialTheme.typography.titleLarge);Spacer(Modifier.height(10.dp))
   LazyRow(horizontalArrangement=Arrangement.spacedBy(12.dp)){items(demo){PosterCard(it){nav.navigate(Routes.LIVE)}}}
  }
 }
}
