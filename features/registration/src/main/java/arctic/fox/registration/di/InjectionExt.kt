package arctic.fox.registration.di

import androidx.fragment.app.Fragment
import arctic.fox.df.di.appComponent
import arctic.fox.registration.presentation.RegistrationF

internal fun Fragment.getComponent(): RegistrationComponent =
    DaggerRegistrationComponent
        .factory()
        .create(appComponent())

internal fun RegistrationF.inject() {
    getComponent()
        .registrationSubcomponent()
        .create()
        .inject(this)
}