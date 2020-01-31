学习官方的todo-mvp-dagger的代码：
其实大部分的难点是Dagger的使用，在使用了dagger-android之后，极大的简化了依赖注入的样板代码，将SubComponent的代码完全让框架库来实现。

使用ContributeAndroidInjector之后，被注解的Activity、Fragment的实例都被引用了，所以如果需要调用其中的属性，直接在module中调用activity、fragment的实例就好，比如：
@Provides
fun provideIntentBoolean(activity:MainActivity):Boolean{
    return activity.intent.getBooleanExtra("test",false);
}
其他的就是普通的Dagger使用。