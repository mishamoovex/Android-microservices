package arctic.fox.registration.di

import androidx.fragment.app.Fragment
import arctic.fox.df.di.appComponent
import arctic.fox.registration.presentation.registration.RegistrationF
import arctic.fox.registration.presentation.profile.CreateProfileF

internal object Injector {

    private var component: RegistrationComponent? = null

    private fun Fragment.createComponent(): RegistrationComponent =
        DaggerRegistrationComponent
            .factory()
            .create(appComponent())

    private fun Fragment.obtainComponent(): RegistrationComponent =
        component ?: createComponent().also { component = it }

    fun inject(fragment: RegistrationF) {
        fragment.obtainComponent()
            .registrationSubcomponent()
            .create()
            .inject(fragment)
    }

    fun inject(fragment: CreateProfileF) {
        fragment.obtainComponent()
            .createProfileSubcomponent()
            .create()
            .inject(fragment)
    }

    fun cleanUp() {
        component = null
    }
}
