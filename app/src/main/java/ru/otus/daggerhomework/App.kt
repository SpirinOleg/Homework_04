package ru.otus.daggerhomework

import android.app.Application
import ru.otus.daggerhomework.di.component.ApplicationComponent
import ru.otus.daggerhomework.di.component.DaggerApplicationComponent

class App : Application() {

    lateinit var appComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerApplicationComponent
            .builder()
            .context(this)
            .build()
    }
}