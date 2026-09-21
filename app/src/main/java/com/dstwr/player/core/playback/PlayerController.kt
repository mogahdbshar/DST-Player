package com.dstwr.player.core.playback
import android.content.Context
import androidx.media3.common.MediaItem
import androidx.media3.common.PlaybackParameters
import androidx.media3.exoplayer.ExoPlayer
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
class PlayerController(context:Context){val player=ExoPlayer.Builder(context).build();private val _state=MutableStateFlow(PlaybackState());val state:StateFlow<PlaybackState> = _state;fun play(url:String){player.setMediaItem(MediaItem.fromUri(url));player.prepare();player.play();publish()};fun toggle(){if(player.isPlaying)player.pause() else player.play();publish()};fun seek(delta:Long){player.seekTo((player.currentPosition+delta).coerceAtLeast(0));publish()};fun setSpeed(speed:Float){player.playbackParameters=PlaybackParameters(speed);_state.value=_state.value.copy(speed=speed)};fun publish(){_state.value=_state.value.copy(isPlaying=player.isPlaying,positionMs=player.currentPosition,durationMs=player.duration.coerceAtLeast(0),bufferedMs=player.bufferedPosition)};fun release(){player.release()}}
