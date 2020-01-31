package com.example.android.architecture.blueprints.todoapp.addedittask

import com.example.android.architecture.blueprints.todoapp.di.scope.ActivityScope
import com.example.android.architecture.blueprints.todoapp.di.scope.FragmentScope
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class AddEditTaskModule {
    @ContributesAndroidInjector
    @FragmentScope
    abstract fun contributeEditFragment(): AddEditTaskFragment

    @Binds
    @ActivityScope
    abstract fun addEditTaskPresenter(addEditTaskPresenter: AddEditTaskPresenter): AddEditTaskContract.Presenter

    @Module
    companion object {
        @Provides
        @ActivityScope
        @JvmStatic
        fun provideTaskId(activity: AddEditTaskActivity): String? {
            return activity.intent.getStringExtra(AddEditTaskFragment.ARGUMENT_EDIT_TASK_ID)
        }

        @Provides
        @ActivityScope
        @JvmStatic
        fun provideStatusDataMissing(activity: AddEditTaskActivity): Boolean {
            return activity.isDataMissing
        }
    }
}