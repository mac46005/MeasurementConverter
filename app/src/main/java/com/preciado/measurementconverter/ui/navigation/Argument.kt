package com.preciado.measurementconverter.ui.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavArgumentBuilder
import androidx.navigation.navArgument
import com.preciado.mvvmlibrary.navigation.IArgument

sealed class Argument(
    override val name: String,
    override var navArgument: NamedNavArgument? = null
): IArgument{
    object Id: Argument("id")

    override fun buildNavArgument(navArgumentBuilder: NavArgumentBuilder.() -> Unit): IArgument {
        navArgument = navArgument(name, navArgumentBuilder)
        return this
    }

    override fun toString(): String {
        return name
    }
}
