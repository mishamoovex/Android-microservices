package arctic.fox.registration.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import arctic.fox.registration.data.RegistrationDataSource
import kotlinx.coroutines.launch
import javax.inject.Inject

class RegistrationVM @Inject constructor(
    private val dataSource: RegistrationDataSource
) : ViewModel() {

    val data = MutableLiveData<String>()

    init {
        viewModelScope.launch {
            data.value = dataSource.register("email1","password1")
        }
    }
}