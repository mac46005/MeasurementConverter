package com.preciado.measurementconverter.di

import com.preciado.measurementconverter.data.models.temperatures.TemperatureConverter
import com.preciado.measurementconverter.data.repo.Temperatures
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class ViewModelModule {
    @Provides
    fun providesTemperatures(): Temperatures{
        return Temperatures()
    }

    @Provides
    fun providesTemperatureConverter(): TemperatureConverter {
        return TemperatureConverter()
    }
}