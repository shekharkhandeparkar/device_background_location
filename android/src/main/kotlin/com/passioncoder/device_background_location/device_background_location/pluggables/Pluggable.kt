package com.passioncoder.device_background_location.device_background_location.pluggables

import android.content.Context

interface Pluggable {
    fun setCallback(context: Context, callbackHandle: Long)
    fun onServiceStart(context: Context) { /*optional*/ }
    fun onServiceDispose(context: Context) {/*optional*/ }
}