package com.preciado.measurementconverter.di

import com.preciado.measurementconverter.data.factory.CelsiusFactory
import com.preciado.measurementconverter.data.factory.FahrenheitFactory
import com.preciado.measurementconverter.data.factory.KelvinFactory
import com.preciado.measurementconverter.data.factory.TemperatureUnitFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun providesFahrenheitFactory(): FahrenheitFactory{
        return FahrenheitFactory()
    }

    @Provides
    @Singleton
    fun providesCelsiusFactory(): CelsiusFactory{
        return CelsiusFactory()
    }

    @Provides
    @Singleton
    fun providesKelvinFactory(): KelvinFactory{
        return KelvinFactory()
    }

    @Provides
    @Singleton
    fun providesTempFactory(
        fahrenheitFactory: FahrenheitFactory,
        celsiusFactory: CelsiusFactory,
        kelvinFactory: KelvinFactory
    ): TemperatureUnitFactory{
        return TemperatureUnitFactory(
            fahrenheitFactory,
            celsiusFactory,
            kelvinFactory
        )
    }
}