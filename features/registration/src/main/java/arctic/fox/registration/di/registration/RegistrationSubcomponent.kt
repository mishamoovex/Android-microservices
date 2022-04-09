package arctic.fox.registration.di.registration

import arctic.fox.registration.presentation.RegistrationF
import dagger.Subcomponent

@Subcomponent(
    modules = [
        RegistrationModule::class
    ]
)
interface RegistrationSubcomponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationSubcomponent
    }

    fun inject(fragment: RegistrationF)
}