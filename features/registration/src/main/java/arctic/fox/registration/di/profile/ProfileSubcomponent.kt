package arctic.fox.registration.di.profile

import arctic.fox.df.di.scopes.ScreenScope
import arctic.fox.registration.presentation.profile.CreateProfileF
import dagger.Subcomponent

@ScreenScope
@Subcomponent(
    modules = [
        ProfileModule::class
    ]
)
interface ProfileSubcomponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): ProfileSubcomponent
    }

    fun inject(fragment: CreateProfileF)
}