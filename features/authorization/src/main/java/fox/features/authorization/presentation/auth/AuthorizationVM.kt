package fox.features.authorization.presentation.auth

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AuthorizationVM : ViewModel() {

    val title = MutableLiveData("auth methods selection")
}