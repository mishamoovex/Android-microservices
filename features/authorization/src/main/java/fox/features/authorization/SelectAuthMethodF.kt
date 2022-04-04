package fox.features.authorization

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import fox.features.authorization.databinding.FragmentSelectAuthMethodBinding

class SelectAuthMethodF : Fragment() {

    private var binding: FragmentSelectAuthMethodBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSelectAuthMethodBinding.inflate(inflater, container, false).apply {
            btnSelectMethod.setOnClickListener {
                findNavController().navigateUp()
            }
        }
        return binding?.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}