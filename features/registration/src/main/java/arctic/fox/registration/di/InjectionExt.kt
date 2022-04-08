package arctic.fox.registration.di

import arctic.fox.df.di.appComponent
import arctic.fox.registration.presentation.RegistrationF

internal fun RegistrationF.inject() {
    DaggerRegistrationComponent
        .factory()
        .create(appComponent())
        .inject(this)
}