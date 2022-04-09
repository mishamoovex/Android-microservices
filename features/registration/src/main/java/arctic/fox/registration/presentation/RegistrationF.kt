package arctic.fox.registration.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import arctic.fox.registration.R
import arctic.fox.registration.databinding.FragmentRegistrationBinding
import arctic.fox.registration.di.Injector
import javax.inject.Inject

class RegistrationF : Fragment() {

    @Inject
    lateinit var vmFactory: ViewModelProvider.Factory
    private val viewModel: RegistrationVM by viewModels { vmFactory }
    private var binding: FragmentRegistrationBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        Injector.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrationBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
            vm = viewModel
            btnRegistrationF.setOnClickListener {
                findNavController().navigate(
                    R.id.action_destination_registration_to_destination_createProfile
                )
            }
        }
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        Injector.cleanUp()
    }
}