package v.razinov.navigation

object FeatureSecondNavigation {
    const val graphName: String = "second"

    object MainScreen: BaseScreen(route = "secondMain")
    object SubScreen : BaseScreen(route = "secondSub")
}
