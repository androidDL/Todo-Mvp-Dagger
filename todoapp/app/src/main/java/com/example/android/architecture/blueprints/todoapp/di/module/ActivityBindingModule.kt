package com.example.android.architecture.blueprints.todoapp.di.module

import com.example.android.architecture.blueprints.todoapp.addedittask.AddEditTaskActivity
import com.example.android.architecture.blueprints.todoapp.addedittask.AddEditTaskModule
import com.example.android.architecture.blueprints.todoapp.di.scope.ActivityScope
import com.example.android.architecture.blueprints.todoapp.statistics.StatisticsActivity
import com.example.android.architecture.blueprints.todoapp.statistics.StatisticsModule
import com.example.android.architecture.blueprints.todoapp.taskdetail.TaskDetailActivity
import com.example.android.architecture.blueprints.todoapp.taskdetail.TaskDetailModule
import com.example.android.architecture.blueprints.todoapp.tasks.TasksActivity
import com.example.android.architecture.blueprints.todoapp.tasks.TasksModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector(modules = [TasksModule::class])
    @ActivityScope
    abstract fun contributeTasksActivity(): TasksActivity

    @ContributesAndroidInjector(modules = [TaskDetailModule::class])
    @ActivityScope
    abstract fun contributeTaskDetailActivity(): TaskDetailActivity

    @ContributesAndroidInjector(modules = [AddEditTaskModule::class])
    @ActivityScope
    abstract fun contributeAddEditTaskActivity(): AddEditTaskActivity

    @ContributesAndroidInjector(modules = [StatisticsModule::class])
    @ActivityScope
    abstract fun contributeStatisticsActivity(): StatisticsActivity

}