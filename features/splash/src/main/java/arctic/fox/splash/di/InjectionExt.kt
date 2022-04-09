package arctic.fox.splash.di

import arctic.fox.df.di.appComponent
import arctic.fox.splash.SplashF

internal fun SplashF.inject() {
    DaggerSplashComponent
        .factory()
        .create(appComponent())
        .inject(this)
}