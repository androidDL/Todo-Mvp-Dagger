package com.example.android.architecture.blueprints.todoapp.taskdetail

import com.example.android.architecture.blueprints.todoapp.di.scope.ActivityScope
import com.example.android.architecture.blueprints.todoapp.di.scope.FragmentScope
import com.example.android.architecture.blueprints.todoapp.taskdetail.TaskDetailActivity.EXTRA_TASK_ID
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector


@Module
abstract class TaskDetailModule2 {
    @FragmentScope
    @ContributesAndroidInjector
    abstract fun contributeTaskDetailFragment(): TaskDetailFragment

    @ActivityScope
    @Binds
    abstract fun taskDetailPresenter(taskDetailPresenter: TaskDetailPresenter): TaskDetailContract.Presenter

    @Module
    companion object {
        @Provides
        @ActivityScope
        @JvmStatic
        fun provideTaskId(activity: TaskDetailActivity): String {
            return activity.intent.getStringExtra(EXTRA_TASK_ID)
        }
    }
}