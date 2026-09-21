package com.dstwr.player.core.designsystem
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dstwr.player.navigation.Routes
@Composable fun DSTBottomBar(current:String,onNavigate:(String)->Unit){
 NavigationBar(containerColor=DSTColors.Surface){
  listOf(Routes.HOME to "Home",Routes.LIVE to "Live",Routes.MOVIES to "Movies",Routes.SERIES to "Series",Routes.SETTINGS to "Settings").forEach{(route,label)->
   NavigationBarItem(selected=current==route,onClick={onNavigate(route)},icon={Text(label.take(1))},label={Text(label)})
  }
 }
}
