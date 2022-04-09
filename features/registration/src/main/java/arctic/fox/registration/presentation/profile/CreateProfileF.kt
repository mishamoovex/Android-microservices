package arctic.fox.registration.presentation.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import arctic.fox.registration.databinding.FragmentCreateProfileBinding
import arctic.fox.registration.di.Injector
import javax.inject.Inject

class CreateProfileF : Fragment() {

    @Inject
    lateinit var vmFactory: ViewModelProvider.Factory
    private val viewModel: CreateProfileVM by viewModels { vmFactory }
    private var binding: FragmentCreateProfileBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        Injector.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateProfileBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
            vm = viewModel
        }
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}