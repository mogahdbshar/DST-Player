package com.dstwr.player.navigation
sealed class Routes(val route:String){ data object Home:Routes("home"); data object Live:Routes("live"); data object Movies:Routes("movies"); data object Series:Routes("series"); data object Search:Routes("search"); data object Settings:Routes("settings") }
