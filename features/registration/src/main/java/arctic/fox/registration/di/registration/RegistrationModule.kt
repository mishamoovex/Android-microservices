package arctic.fox.registration.di.registration

import androidx.lifecycle.ViewModel
import arctic.fox.df.di.factories.ViewModelKey
import arctic.fox.registration.presentation.RegistrationVM
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface RegistrationModule {

    @Binds
    @IntoMap
    @ViewModelKey(RegistrationVM::class)
    fun bindViewModel(impl: RegistrationVM): ViewModel
}