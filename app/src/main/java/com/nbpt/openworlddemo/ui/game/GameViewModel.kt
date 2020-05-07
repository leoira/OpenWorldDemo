package com.nbpt.openworlddemo.ui.game

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Game Fragment"
    }
    val text: LiveData<String> = _text
}