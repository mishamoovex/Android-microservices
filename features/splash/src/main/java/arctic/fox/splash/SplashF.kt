package arctic.fox.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import arctic.fox.df.MainActivity
import arctic.fox.splash.databinding.FragmentSplashBinding

class SplashF : Fragment() {

    private var binding: FragmentSplashBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
            btnSplash.setOnClickListener {
                (requireActivity() as MainActivity).navigateToAuth()
            }
        }
        return binding?.root
    }
}