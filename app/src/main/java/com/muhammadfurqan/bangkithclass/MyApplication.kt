package com.muhammadfurqan.bangkithclass

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * @author by furqan on 20/05/2021
 */
// Hilt Initialization
@HiltAndroidApp
class MyApplication : Application() {

    // Dagger Initialization
//    val appComponent: AppComponent by lazy {
//        DaggerAppComponent.factory().create()
//    }

}