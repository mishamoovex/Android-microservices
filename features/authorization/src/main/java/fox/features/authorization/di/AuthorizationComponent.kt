package fox.features.authorization.di

import arctic.fox.df.di.AppComponent
import arctic.fox.df.di.scopes.FeatureScope
import dagger.Component
import fox.features.authorization.presentation.auth.AuthorizationF
import fox.features.authorization.presentation.email_reset.ResetEmailPasswordF

@FeatureScope
@Component(dependencies = [AppComponent::class])
interface AuthorizationComponent {

    @Component.Factory
    interface Factory {
        fun create(appComponent: AppComponent): AuthorizationComponent
    }

    fun inject(fragment: AuthorizationF)
    fun inject(fragment: ResetEmailPasswordF)
}