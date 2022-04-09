package arctic.fox.registration.di.registration

import androidx.lifecycle.ViewModel
import arctic.fox.df.di.factories.ViewModelKey
import arctic.fox.df.di.scopes.ScreenScope
import arctic.fox.registration.presentation.registration.RegistrationVM
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface RegistrationModule {

    @ScreenScope
    @Binds
    @IntoMap
    @ViewModelKey(RegistrationVM::class)
    fun bindViewModel(impl: RegistrationVM): ViewModel
}