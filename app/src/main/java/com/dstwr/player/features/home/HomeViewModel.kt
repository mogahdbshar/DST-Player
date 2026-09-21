package com.dstwr.player.features.home
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
class HomeViewModel:ViewModel(){private val _sections=MutableStateFlow(listOf(HomeSection("Featured",SectionType.FEATURED),HomeSection("Continue Watching",SectionType.CONTINUE),HomeSection("Live Channels",SectionType.LIVE),HomeSection("Movies",SectionType.MOVIES),HomeSection("Series",SectionType.SERIES)));val sections:StateFlow<List<HomeSection>>=_sections}
