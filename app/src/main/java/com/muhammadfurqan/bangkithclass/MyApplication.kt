package com.muhammadfurqan.bangkithclass

import android.app.Application
import com.muhammadfurqan.bangkithclass.di.AppComponent
import com.muhammadfurqan.bangkithclass.di.DaggerAppComponent

/**
 * @author by furqan on 20/05/2021
 */
class MyApplication : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create()
    }

}