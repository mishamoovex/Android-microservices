package arctic.fox.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import arctic.fox.df.presentation.MainActivity
import arctic.fox.splash.databinding.FragmentSplashBinding
import arctic.fox.splash.di.inject

class SplashF : Fragment() {

    private var binding: FragmentSplashBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        inject()
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
            btnSplash.setOnClickListener {
                (requireActivity() as MainActivity).navigateToRegistration()
            }
        }
        return binding?.root
    }
}