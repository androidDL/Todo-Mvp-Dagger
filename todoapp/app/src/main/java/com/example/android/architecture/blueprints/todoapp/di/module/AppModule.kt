package com.example.android.architecture.blueprints.todoapp.di.module

import android.app.Application
import androidx.room.Room
import com.example.android.architecture.blueprints.todoapp.data.source.local.TasksDao
import com.example.android.architecture.blueprints.todoapp.data.source.local.ToDoDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [DataSourceModule::class])
class AppModule(val application: Application) {

    @Provides
    @Singleton
    fun provideDatabase(): ToDoDatabase {
        return Room.databaseBuilder(application.applicationContext,
                ToDoDatabase::class.java, "Tasks.db")
                .build()
    }

    @Provides
    @Singleton
    fun provideTasksDao(toDoDatabase: ToDoDatabase): TasksDao {
        return toDoDatabase.taskDao()
    }


}