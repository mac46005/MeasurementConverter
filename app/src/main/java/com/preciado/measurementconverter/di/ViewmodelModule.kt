package com.preciado.measurementconverter.di

import com.preciado.measurementconverter.data.models.TemperatureConverter
import com.preciado.measurementconverter.data.repo.Temperatures
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

@Module
@InstallIn(ViewmodelModule::class)
class ViewmodelModule {
    @Provides
    fun providesTemperatures(): Temperatures{
        return Temperatures()
    }

    @Provides
    fun providesTemperatureConverter(): TemperatureConverter{
        return TemperatureConverter()
    }
}