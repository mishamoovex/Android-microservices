package arctic.fox.registration.presentation.models

import androidx.annotation.StringRes

data class RegistrationUiState(
    @StringRes val emailError: Int?,
    @StringRes val passwordError: Int?,
    @StringRes val passwordConformationError: Int?,
    val enableActionButton: Boolean
)
