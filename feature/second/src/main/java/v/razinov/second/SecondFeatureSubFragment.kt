package v.razinov.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import v.razinov.feature.second.databinding.FragmentSecondSubBinding
import v.razinov.navigation.FeatureFirstNavigation

class SecondFeatureSubFragment : Fragment() {

    private var _binding: FragmentSecondSubBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSecondSubBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnToSecondMain.setOnClickListener {
            findNavController().navigate(FeatureFirstNavigation.MainScreen.route)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}