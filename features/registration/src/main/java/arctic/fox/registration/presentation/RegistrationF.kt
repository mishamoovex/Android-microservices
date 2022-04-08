package arctic.fox.registration.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import arctic.fox.registration.di.inject

class RegistrationF : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        inject()
        super.onCreate(savedInstanceState)
    }
}