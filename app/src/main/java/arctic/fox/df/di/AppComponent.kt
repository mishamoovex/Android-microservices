package arctic.fox.df.di

import arctic.fox.df.presentation.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {

    fun inject(activity: MainActivity)

}