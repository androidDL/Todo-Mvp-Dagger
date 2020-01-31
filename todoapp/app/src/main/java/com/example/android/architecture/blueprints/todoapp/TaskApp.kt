package com.example.android.architecture.blueprints.todoapp

import com.example.android.architecture.blueprints.todoapp.di.component.DaggerAppComponent
import com.example.android.architecture.blueprints.todoapp.di.module.AppModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class TaskApp : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
                .appModule(appModule = AppModule(this))
                .build()
    }

}