package com.dstwr.player.features.empty
import androidx.compose.runtime.Composable
@Composable fun NoFavorites(onAdd:()->Unit)=EmptyState("No Favorites","Save channels, movies and series here.","Browse",onAdd)
@Composable fun NoDownloads()=EmptyState("No Downloads","Downloaded media will appear here.")
@Composable fun NoInternet(onRetry:()->Unit)=EmptyState("No Internet","Check your connection and try again.","Retry",onRetry)
@Composable fun NoResults()=EmptyState("No Results","Nothing matched your search.")
