package arctic.fox.registration.di

import arctic.fox.df.di.AppComponent
import arctic.fox.df.di.scopes.FeatureScope
import arctic.fox.registration.presentation.RegistrationF
import dagger.Component

@FeatureScope
@Component(dependencies = [AppComponent::class])
interface RegistrationComponent {

    @Component.Factory
    interface Factory {
        fun create(appComponent: AppComponent): RegistrationComponent
    }

    fun inject(fragment: RegistrationF)
}