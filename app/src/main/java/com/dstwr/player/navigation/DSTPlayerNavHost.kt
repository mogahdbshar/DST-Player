package com.dstwr.player.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.dstwr.player.features.dashboard.DashboardScreen
@Composable fun DSTPlayerNavHost(){ val nav=rememberNavController(); NavHost(navController=nav,startDestination=Routes.Home.route){ composable(Routes.Home.route){DashboardScreen(nav)}; composable(Routes.Live.route){DashboardScreen(nav)}; composable(Routes.Movies.route){DashboardScreen(nav)}; composable(Routes.Series.route){DashboardScreen(nav)}; composable(Routes.Search.route){DashboardScreen(nav)}; composable(Routes.Settings.route){DashboardScreen(nav)} } }
