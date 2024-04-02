package v.razinov.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import v.razinov.feature.second.databinding.FragmentSecondMainBinding
import v.razinov.navigation.FeatureSecondNavigation

class SecondFeatureMainFragment : Fragment() {

    private var _binding: FragmentSecondMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSecondMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnToSub.setOnClickListener {
            findNavController().navigate(FeatureSecondNavigation.SubScreen.route)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}