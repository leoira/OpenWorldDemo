package com.nbpt.openworlddemo.ui.ngo

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class NgoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is NGO Fragment"
    }
    val text: LiveData<String> = _text
}