package arctic.fox.registration.di.profile

import androidx.lifecycle.ViewModel
import arctic.fox.df.di.factories.ViewModelKey
import arctic.fox.df.di.scopes.ScreenScope
import arctic.fox.registration.presentation.profile.CreateProfileVM
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ProfileModule {

    @ScreenScope
    @Binds
    @IntoMap
    @ViewModelKey(CreateProfileVM::class)
    fun bindViewModel(impl: CreateProfileVM): ViewModel
}