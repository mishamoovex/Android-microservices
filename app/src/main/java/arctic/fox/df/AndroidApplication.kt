package arctic.fox.df

import android.app.Application
import arctic.fox.df.di.DaggerAppComponent

internal class AndroidApplication : Application() {

    internal val appComponent = DaggerAppComponent.create()
}