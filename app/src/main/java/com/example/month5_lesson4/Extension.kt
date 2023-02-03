package com.example.month5_lesson4

import android.view.View
import com.google.android.material.snackbar.Snackbar

fun View.showSnackBar(message:String){
    val snackBar = Snackbar.make(this, message, Snackbar.LENGTH_SHORT)
    snackBar.show()
}