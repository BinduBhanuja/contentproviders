package com.example.usecase3.dagger;


import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        ActivityBuilderModule.class,
        AndroidSupportInjectionModule.class})
interface AppComponent extends AndroidInjector<MyApplication> {
}
