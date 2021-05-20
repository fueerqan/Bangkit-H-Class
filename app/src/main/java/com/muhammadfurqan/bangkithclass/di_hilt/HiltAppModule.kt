package com.muhammadfurqan.bangkithclass.di_hilt

import com.muhammadfurqan.bangkithclass.model.Engine
import com.muhammadfurqan.bangkithclass.model.HiltEngine
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

/**
 * @author by furqan on 20/05/2021
 */
@Module
@InstallIn(ActivityComponent::class)
class HiltAppModule {

    @Provides
    fun provideEngine(): Engine = HiltEngine()

}