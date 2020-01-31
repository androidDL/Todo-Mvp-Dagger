package com.example.android.architecture.blueprints.todoapp.taskdetail;

import com.example.android.architecture.blueprints.todoapp.di.scope.ActivityScope;
import com.example.android.architecture.blueprints.todoapp.di.scope.FragmentScope;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

import static com.example.android.architecture.blueprints.todoapp.taskdetail.TaskDetailActivity.EXTRA_TASK_ID;

@Module
public abstract class TaskDetailModule {
    @ContributesAndroidInjector
    @FragmentScope
    abstract TaskDetailFragment contributeTaskDetailFragment();

    @ActivityScope
    @Binds
    abstract TaskDetailContract.Presenter taskDetailPresenter(TaskDetailPresenter presenter);

    @Provides
    @ActivityScope
    static String provideTaskId(TaskDetailActivity activity){
        return activity.getIntent().getStringExtra(EXTRA_TASK_ID);
    }
}
