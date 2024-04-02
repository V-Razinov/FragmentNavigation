package v.razinov.fragmentnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import v.razinov.fragmentnavigation.databinding.FragmentScreenSelectionBinding
import v.razinov.navigation.FeatureFirstNavigation
import v.razinov.navigation.FeatureSecondNavigation

class ScreenSelectionFragment : Fragment() {

    private var _binding: FragmentScreenSelectionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentScreenSelectionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFirstMain.setOnClickListener {
            findNavController().navigate(FeatureFirstNavigation.MainScreen.route)
        }
        binding.btnFirstSub.setOnClickListener {
            findNavController().navigate(FeatureFirstNavigation.SubScreen.route)
        }
        binding.btnSecondMain.setOnClickListener {
            findNavController().navigate(FeatureSecondNavigation.MainScreen.route)
        }
        binding.btnSecondSub.setOnClickListener {
            findNavController().navigate(FeatureSecondNavigation.SubScreen.route)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}