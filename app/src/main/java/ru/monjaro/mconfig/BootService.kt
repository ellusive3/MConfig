package ru.monjaro.mconfig

import android.content.Context
import android.content.Intent

class BootService : android.content.BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?){
        if (context != null && intent != null &&
           ("qwerty" == intent.action || "android.intent.action.BOOT_COMPLETED" == intent.action || "android.intent.action.QUICKBOOT_POWERON" == intent.action || "android.intent.action.LOCKED_BOOT_COMPLETED" == intent.action) ) {
            if(!MConfigStartProc.bootStartService) {
                MConfigStartProc.bootStartService  = true
                MConfigStartProc.startService(context, false)
                MConfigStartProc.startInitService(context)
            }
        }
    }
}