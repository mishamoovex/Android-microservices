package arctic.fox.registration.di

import arctic.fox.registration.di.registration.RegistrationSubcomponent
import dagger.Module

@Module(
    subcomponents = [
        RegistrationSubcomponent::class
    ]
)
interface SubcomponentsModule