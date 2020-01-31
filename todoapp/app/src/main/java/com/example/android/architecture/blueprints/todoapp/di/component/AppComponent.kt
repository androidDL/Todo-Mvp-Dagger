package com.example.android.architecture.blueprints.todoapp.di.component

import com.example.android.architecture.blueprints.todoapp.TaskApp
import com.example.android.architecture.blueprints.todoapp.di.module.ActivityBindingModule
import com.example.android.architecture.blueprints.todoapp.di.module.AppModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, ActivityBindingModule::class])
interface AppComponent : AndroidInjector<TaskApp> {
    @Component.Builder
    interface Builder {
        fun appModule(appModule: AppModule):Builder
        fun build(): AppComponent
    }
}