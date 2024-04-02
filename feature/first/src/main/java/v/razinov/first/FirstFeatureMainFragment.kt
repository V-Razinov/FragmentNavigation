package v.razinov.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import v.razinov.feature.first.databinding.FragmentFirstMainBinding
import v.razinov.navigation.FeatureFirstNavigation

class FirstFeatureMainFragment : Fragment() {

    private var _binding: FragmentFirstMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentFirstMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnToSub.setOnClickListener {
            findNavController().navigate(route = FeatureFirstNavigation.SubScreen.route)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}