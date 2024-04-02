package v.razinov.navigation

import android.os.Bundle
import androidx.core.os.bundleOf

object FeatureFirstNavigation {
    const val graphName: String = "first"

    object MainScreen : BaseScreen(route = "firstMain")
    object SubScreen : BaseScreen(route = "firstSub") {
        data class Args(val from: String) {
            constructor(bundle: Bundle): this(from = bundle.getString("from")!!)
            fun toBundle(): Bundle = bundleOf("from" to from)
        }
    }
}
