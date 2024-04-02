package v.razinov.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import v.razinov.feature.first.databinding.FragmentFirstSubBinding
import v.razinov.navigation.FeatureFirstNavigation
import v.razinov.navigation.FeatureSecondNavigation

class FirstFeatureSubFragment : Fragment() {

    private var _binding: FragmentFirstSubBinding? = null
    private val binding get() = _binding!!

    private val args by lazy { FeatureFirstNavigation.SubScreen.Args(requireArguments()) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentFirstSubBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnToSecondMain.setOnClickListener {
            findNavController().navigate(FeatureSecondNavigation.MainScreen.route)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}