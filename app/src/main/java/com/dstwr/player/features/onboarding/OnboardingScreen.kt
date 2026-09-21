package com.dstwr.player.features.onboarding
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable fun OnboardingScreen(onDone:()->Unit){Box(Modifier.fillMaxSize().padding(28.dp),contentAlignment=Alignment.Center){Column(horizontalAlignment=Alignment.CenterHorizontally){Text("DST Player",style=MaterialTheme.typography.displaySmall);Spacer(Modifier.height(12.dp));Text("Local media and IPTV in one modern player.");Spacer(Modifier.height(28.dp));Button(onClick=onDone){Text("Get Started")}}}}
