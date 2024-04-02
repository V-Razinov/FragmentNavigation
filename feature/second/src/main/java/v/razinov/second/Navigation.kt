package v.razinov.second

import androidx.navigation.NavGraphBuilder
import androidx.navigation.fragment.fragment
import androidx.navigation.navigation
import v.razinov.navigation.FeatureSecondNavigation

fun NavGraphBuilder.secondFeature() = navigation(
    startDestination = FeatureSecondNavigation.MainScreen.route,
    route = FeatureSecondNavigation.graphName
) {
    fragment<SecondFeatureMainFragment>(FeatureSecondNavigation.MainScreen.route)
    fragment<SecondFeatureSubFragment>(FeatureSecondNavigation.SubScreen.route)
}