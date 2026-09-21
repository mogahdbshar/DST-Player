package com.dstwr.player.core.model
data class Playlist(
    val id: Long = 0,
    val name: String,
    val url: String,
    val type: PlaylistType
)
