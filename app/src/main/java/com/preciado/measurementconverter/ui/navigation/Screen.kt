package com.preciado.measurementconverter.ui.navigation

import androidx.navigation.NamedNavArgument
import com.preciado.mvvmlibrary.navigation.IArgument
import com.preciado.mvvmlibrary.navigation.IScreen
import com.preciado.mvvmlibrary.navigation.util.CreateRoute

sealed class Screen(
    override val baseRoute: String,
    override val arguments: List<IArgument>?
) : IScreen {
    override fun fullRoute(): String {
        return CreateRoute.fullRoute(baseRoute, arguments)
    }

    override fun namedNavArguments(): List<NamedNavArgument>? {
        return CreateRoute.namedNavArguments(arguments = arguments)
    }

    override fun withArgs(args: List<String>): String {
        return CreateRoute.withArgs(baseRoute = baseRoute, arguments = args)
    }
}