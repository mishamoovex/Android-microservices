package arctic.fox.registration.di

import arctic.fox.df.di.scopes.FeatureScope
import arctic.fox.registration.data.RegistrationDataSource
import arctic.fox.registration.data.RegistrationDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataSourceModule {

    @Binds
    @FeatureScope
    fun bindRegistrationDataSource(impl: RegistrationDataSourceImpl): RegistrationDataSource
}