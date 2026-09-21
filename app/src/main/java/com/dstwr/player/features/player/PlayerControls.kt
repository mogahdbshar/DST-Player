package com.dstwr.player.features.player
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dstwr.player.core.designsystem.DSTColors
import com.dstwr.player.core.utils.TimeFormat
@Composable fun PlayerControls(position:Long,duration:Long,isPlaying:Boolean,onToggle:()->Unit,onBack:()->Unit,onForward:()->Unit){Column(Modifier.fillMaxWidth().padding(16.dp)){Slider(value=if(duration>0)position.toFloat()/duration else 0f,onValueChange={},enabled=false);Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.SpaceEvenly){TextButton(onClick=onBack){Text("-10",color=DSTColors.Cyan)};Button(onClick=onToggle){Text(if(isPlaying)"Pause" else "Play")};TextButton(onClick=onForward){Text("+10",color=DSTColors.Cyan)}};Text(TimeFormat.duration(position)+" / "+TimeFormat.duration(duration),color=DSTColors.TextSecondary)}}
