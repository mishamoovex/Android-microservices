package arctic.fox.registration.di

import androidx.fragment.app.Fragment
import arctic.fox.df.di.appComponent
import arctic.fox.registration.presentation.RegistrationF
import arctic.fox.registration.presentation.profile.CreateProfileF

private fun Fragment.getComponent(): RegistrationComponent =
    DaggerRegistrationComponent
        .factory()
        .create(appComponent())

internal fun RegistrationF.inject() {
    getComponent()
        .registrationSubcomponent()
        .create()
        .inject(this)
}

internal fun CreateProfileF.inject() {
    getComponent()
        .createProfileSubcomponent()
        .create()
        .inject(this)
}