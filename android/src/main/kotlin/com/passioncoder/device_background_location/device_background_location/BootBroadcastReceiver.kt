package com.passioncoder.device_background_location.device_background_location

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class BootBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "android.intent.action.BOOT_COMPLETED") {
            BackgroundLocatorPlugin.registerAfterBoot(context)
        }
    }
}