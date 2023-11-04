package com.preciado.measurementconverter.data.factory.temperatures

import com.preciado.measurementconverter.data.factory.IFactory
import com.preciado.measurementconverter.data.models.temperatures.units.Celsius
import com.preciado.measurementconverter.data.models.temperatures.units.Fahrenheit
import com.preciado.measurementconverter.data.models.temperatures.units.Kelvin
import com.preciado.measurementconverter.data.models.temperatures.units.TemperatureUnit
import com.preciado.measurementconverter.data.models.temperatures.TemperatureUnits
import javax.inject.Inject

object TemperatureUnitFactory: IFactory<TemperatureUnit> {

    override fun build(vararg params: Any?): TemperatureUnit {

//        return when(params[0] as TemperatureUnits){
//            TemperatureUnits.FAHRENHEIT -> {
//                fahrenheitIFactory.build()
//            }
//
//            TemperatureUnits.CELSIUS -> {
//                celsiusIFactory.build()
//            }
//
//            TemperatureUnits.KELVIN -> {
//                kelvinIFactory.build()
//            }
//        }
        val tempUnit = params[0] as TemperatureUnits
        return tempUnit.buildUnit()
    }

}