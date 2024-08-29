package com.alvin.mob24test.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {
    val msg: MutableStateFlow<String> = MutableStateFlow("")
    suspend fun fetchData(): String {
        delay(1000)
        return "Hello World"
    }

    fun loadMessage() {
        viewModelScope.launch {
            msg.value = "HelloStateFlow"
        }
    }
}