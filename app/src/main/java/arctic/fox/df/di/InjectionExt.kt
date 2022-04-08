package arctic.fox.df.di

import androidx.fragment.app.Fragment
import arctic.fox.df.AndroidApplication
import arctic.fox.df.presentation.MainActivity

fun Fragment.appComponent(): AppComponent =
    (requireActivity().application as AndroidApplication).appComponent


internal fun MainActivity.inject() {
    (application as AndroidApplication)
        .appComponent
        .inject(this)
}