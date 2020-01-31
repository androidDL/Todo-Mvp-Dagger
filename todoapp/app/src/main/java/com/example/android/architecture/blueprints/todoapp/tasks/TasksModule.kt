package com.example.android.architecture.blueprints.todoapp.tasks

import com.example.android.architecture.blueprints.todoapp.di.scope.ActivityScope
import com.example.android.architecture.blueprints.todoapp.di.scope.FragmentScope
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class TasksModule {
    @FragmentScope
    @ContributesAndroidInjector
    abstract fun tasksFragment(): TasksFragment

    @ActivityScope
    @Binds
    abstract fun taskPresenter(tasksPresenter: TasksPresenter): TasksContract.Presenter
}