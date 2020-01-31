package com.example.android.architecture.blueprints.todoapp.di.module

import com.example.android.architecture.blueprints.todoapp.data.source.TasksDataSource
import com.example.android.architecture.blueprints.todoapp.data.source.local.TasksLocalDataSource
import com.example.android.architecture.blueprints.todoapp.data.source.remote.TasksRemoteDataSource
import com.example.android.architecture.blueprints.todoapp.di.Local
import com.example.android.architecture.blueprints.todoapp.di.Remote
import dagger.Binds
import dagger.Module

@Module
abstract class DataSourceModule {
    @Binds
    @Local
    abstract fun provideLocalDataSource(localDataSource: TasksLocalDataSource): TasksDataSource

    @Binds
    @Remote
    abstract fun provideRemoteDataSource(remoteDataSource: TasksRemoteDataSource): TasksDataSource
}