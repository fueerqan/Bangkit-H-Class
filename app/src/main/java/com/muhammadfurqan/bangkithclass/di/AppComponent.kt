package com.muhammadfurqan.bangkithclass.di

import com.muhammadfurqan.bangkithclass.MainActivity
import dagger.Component

/**
 * @author by furqan on 20/05/2021
 */
@Component(modules = [AppModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(): AppComponent
    }

    fun inject(activity: MainActivity)

}