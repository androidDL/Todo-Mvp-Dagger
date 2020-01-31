package com.example.android.architecture.blueprints.todoapp.taskdetail

import com.example.android.architecture.blueprints.todoapp.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
object TaskDetailModule3 {
    @Provides
    @ActivityScope
    @JvmStatic
    fun provideTaskId3(activity: TaskDetailActivity): String {
        return activity.intent.getStringExtra(TaskDetailActivity.EXTRA_TASK_ID)
    }
}

@Module
object TaskDetailModule4{
    @Provides
    @ActivityScope
    fun provideTaskId4(activity: TaskDetailActivity): String {
        return activity.intent.getStringExtra(TaskDetailActivity.EXTRA_TASK_ID)
    }
}