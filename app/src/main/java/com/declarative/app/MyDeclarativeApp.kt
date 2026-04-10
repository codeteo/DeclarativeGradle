package com.declarative.app

import android.app.Application
import com.declarative.app.di.AppGraph
import dev.zacsweers.metro.createGraphFactory

class MyDeclarativeApp : Application() {

    val appGraph by lazy { createGraphFactory<AppGraph.Factory>().create(this) }

    override fun onCreate() {
        super.onCreate()
    }
}