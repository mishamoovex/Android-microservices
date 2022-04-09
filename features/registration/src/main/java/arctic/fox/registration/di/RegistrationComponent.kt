package arctic.fox.registration.di

import arctic.fox.df.di.AppComponent
import arctic.fox.df.di.factories.FactoriesModule
import arctic.fox.df.di.scopes.FeatureScope
import arctic.fox.registration.di.profile.ProfileSubcomponent
import arctic.fox.registration.di.registration.RegistrationSubcomponent
import dagger.Component

@FeatureScope
@Component(
    dependencies = [
        AppComponent::class
    ],
    modules = [
        SubcomponentsModule::class,
        FactoriesModule::class,
        DataSourceModule::class
    ]
)
interface RegistrationComponent {

    @Component.Factory
    interface Factory {
        fun create(appComponent: AppComponent): RegistrationComponent
    }

    fun registrationSubcomponent(): RegistrationSubcomponent.Factory
    fun createProfileSubcomponent(): ProfileSubcomponent.Factory
}