package com.preciado.measurementconverter.data.factory

import com.preciado.measurementconverter.data.interfaces.IMeasurementUnit
import com.preciado.measurementconverter.data.models.Celsius
import com.preciado.measurementconverter.data.models.Fahrenheit
import com.preciado.measurementconverter.data.models.Kelvin
import com.preciado.measurementconverter.data.models.TemperatureUnits
import javax.inject.Inject

class TemperatureUnitFactory @Inject constructor(
    private val fahrenheitIFactory: IFactory<Fahrenheit>,
    private val celsiusIFactory: IFactory<Celsius>,
    private val kelvinIFactory: IFactory<Kelvin>
): IFactory<IMeasurementUnit> {

    override fun build(vararg params: Any?): IMeasurementUnit {

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