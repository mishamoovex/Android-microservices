package fox.features.authorization.presentation.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import fox.features.authorization.R
import fox.features.authorization.databinding.FragmentSelectAuthMethodBinding

class AuthorizationF : Fragment() {

    private var binding: FragmentSelectAuthMethodBinding? = null
    private val viewModel: AuthorizationVM by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSelectAuthMethodBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
            vm = viewModel

            btnSelectMethod.setOnClickListener { navigateToPasswordAuth() }
        }
        return binding?.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun navigateToPasswordAuth() {
        findNavController().navigate(
            R.id.action_destination_selectAuthMethod_to_destination_passwordAuth
        )
    }
}