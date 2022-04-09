package arctic.fox.registration.data

interface RegistrationDataSource {

    suspend fun register(email: String, pass: String): String
}