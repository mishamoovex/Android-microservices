package arctic.fox.registration.presentation.registration

import androidx.lifecycle.ViewModel
import arctic.fox.registration.data.RegistrationDataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import javax.inject.Inject

class RegistrationVM @Inject constructor(
    private val dataSource: RegistrationDataSource
) : ViewModel() {

    val email = MutableStateFlow<String?>(null)
    val password = MutableStateFlow<String?>(null)
    val passwordConfirm = MutableStateFlow<String?>(null)

    val enableFlow: StateFlow<Boolean> = MutableStateFlow(false)

    val isActionButtonEnabled = combine(
        flows = listOf(email, password, passwordConfirm),
        transform = { flows -> flows.all { it != null } }
    )

}