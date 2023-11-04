package com.preciado.measurementconverter.data.factory

import com.preciado.measurementconverter.data.models.temperatures.units.Celsius
import com.preciado.measurementconverter.data.models.temperatures.units.Fahrenheit
import com.preciado.measurementconverter.data.models.temperatures.units.Kelvin
import com.preciado.measurementconverter.data.models.temperatures.units.TemperatureUnit
import com.preciado.measurementconverter.data.models.temperatures.TemperatureUnits
import javax.inject.Inject

class TemperatureUnitFactory @Inject constructor(
    private val fahrenheitIFactory: IFactory<Fahrenheit>,
    private val celsiusIFactory: IFactory<Celsius>,
    private val kelvinIFactory: IFactory<Kelvin>
): IFactory<TemperatureUnit> {

    override fun build(vararg params: Any?): TemperatureUnit {

        return when(params[0] as TemperatureUnits){
            TemperatureUnits.FAHRENHEIT -> {
                fahrenheitIFactory.build()
            }

            TemperatureUnits.CELSIUS -> {
                celsiusIFactory.build()
            }

            TemperatureUnits.KELVIN -> {
                kelvinIFactory.build()
            }
        }
    }

}