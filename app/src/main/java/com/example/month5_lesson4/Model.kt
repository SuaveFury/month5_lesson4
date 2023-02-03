package com.example.month5_lesson4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Model @Inject constructor():ViewModel(){
    private val _count = MutableLiveData<Float>()
    val count : LiveData<Float> = _count
    private var diff = 0.0f
    private val minus = 0.0f
    private var plus = 10.0f
    private var _snackBar = MutableLiveData<String>()
    val snackBar : LiveData<String> = _snackBar

    fun increase(){
        if (diff ==plus)  _snackBar.value = "You got maximum value 10.0"
        else {
            diff++
            _count.value = diff
        }
    }
    fun reduce(){
        if (diff ==minus) _snackBar.value = "You got minimum value 0.0"
        else{
            diff --
            _count.value = diff
        }
    }
}