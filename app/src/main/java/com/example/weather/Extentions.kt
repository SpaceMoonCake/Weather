package com.example.weather

import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import java.lang.RuntimeException

fun EditText.shawKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    this.requestFocus()
    imm.showSoftInput(this, 0)
}

fun EditText.hideKeyboard():Boolean {
    try {
        val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE)  as InputMethodManager
        return inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
    } catch (ignored: RuntimeException){ }
    return false
}
