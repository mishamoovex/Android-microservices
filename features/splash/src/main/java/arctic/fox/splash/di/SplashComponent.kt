package arctic.fox.splash.di

import arctic.fox.df.di.AppComponent
import arctic.fox.df.di.scopes.FeatureScope
import arctic.fox.splash.SplashF
import dagger.Component

@FeatureScope
@Component(dependencies = [AppComponent::class])
internal interface SplashComponent {

    @Component.Factory
    interface Factory {
        fun create(appComponent: AppComponent): SplashComponent
    }

    fun inject(fragment: SplashF)
}