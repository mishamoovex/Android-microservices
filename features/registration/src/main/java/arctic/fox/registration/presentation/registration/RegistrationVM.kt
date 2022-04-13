package arctic.fox.registration.presentation.registration

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import arctic.fox.lifecycle.livedata.CombinedLiveData
import arctic.fox.registration.data.RegistrationDataSource
import javax.inject.Inject

class RegistrationVM @Inject constructor(
    private val dataSource: RegistrationDataSource
) : ViewModel() {

    val email = MutableLiveData<String?>(null)
    val password = MutableLiveData<String?>(null)
    val passwordConfirm = MutableLiveData<String?>(null)

    val enableActionButton: LiveData<Boolean> = CombinedLiveData<Boolean>(
        email,
        password,
        passwordConfirm
    ) { values -> values.all { it != null } }


    fun registerByEmail(){

    }

}