package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.di.scope.ActivityScope
import com.example.android.architecture.blueprints.todoapp.di.scope.FragmentScope
import com.example.android.architecture.blueprints.todoapp.taskdetail.TaskDetailActivity
import com.example.android.architecture.blueprints.todoapp.taskdetail.TaskDetailActivity.EXTRA_TASK_ID
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector


@Module
abstract class StatisticsModule {

    @ContributesAndroidInjector
    @FragmentScope
    abstract fun contributeStatisticsFragment(): StatisticsFragment

    @Binds
    @ActivityScope
    abstract fun statisticsPresenter(statisticsPresenter: StatisticsPresenter): StatisticsContract.Presenter

    @Module
    companion object {
        @JvmStatic
        @Provides
        @ActivityScope
        fun provideTaskId(activity: TaskDetailActivity): String {
            return activity.intent.getStringExtra(EXTRA_TASK_ID)
        }
    }

}

