package fox.features.authorization.presentation.select

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SelectAuthMethodVM : ViewModel() {

    val title = MutableLiveData("auth methods selection")
}