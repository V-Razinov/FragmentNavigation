package v.razinov.first

import androidx.navigation.NavGraphBuilder
import androidx.navigation.fragment.fragment
import androidx.navigation.navigation
import v.razinov.navigation.FeatureFirstNavigation

fun NavGraphBuilder.firstFeature() = navigation(
    startDestination = FeatureFirstNavigation.MainScreen.route,
    route = FeatureFirstNavigation.graphName
) {
    fragment<FirstFeatureMainFragment>(FeatureFirstNavigation.MainScreen.route)
    fragment<FirstFeatureSubFragment>(FeatureFirstNavigation.SubScreen.route)
}
