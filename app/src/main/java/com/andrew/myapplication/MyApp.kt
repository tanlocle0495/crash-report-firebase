package com.andrew.myapplication

import android.app.Application
import android.util.Log
import com.google.firebase.crashlytics.FirebaseCrashlytics

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Thread.setDefaultUncaughtExceptionHandler { paramThread, paramThrowable -> //Catch your exception
            Log.e("ERROR",paramThread.name);
            FirebaseCrashlytics.getInstance().log(paramThread.name)
            System.exit(2)
        }
    }


}