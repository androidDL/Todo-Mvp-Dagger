package com.example.android.architecture.blueprints.todoapp.di.module

import com.example.android.architecture.blueprints.todoapp.di.scope.ActivityScope
import com.example.android.architecture.blueprints.todoapp.tasks.TasksActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector
    @ActivityScope
    abstract fun contributeTasksActivity():TasksActivity
}