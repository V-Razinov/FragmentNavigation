package v.razinov.fragmentnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.createGraph
import androidx.navigation.findNavController
import androidx.navigation.fragment.fragment
import v.razinov.first.firstFeature
import v.razinov.fragmentnavigation.databinding.ActivityMainBinding
import v.razinov.second.secondFeature
import java.net.CookieManager

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        android.webkit.CookieManager.getInstance().
        navController.graph = navController.createGraph(
            startDestination = "FragmentSelection",
            route = "MainGraph",
        ) {
            fragment<ScreenSelectionFragment>(route = "FragmentSelection") {
                deepLink("mobile:qweqwe")
            }
            firstFeature()
            secondFeature()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}