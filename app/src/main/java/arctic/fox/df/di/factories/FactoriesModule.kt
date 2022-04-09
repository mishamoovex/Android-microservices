package arctic.fox.df.di.factories

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
interface FactoriesModule {

    @Binds
    fun bindViewModelFactory(impl: CustomViewModelFactory): ViewModelProvider.Factory
}