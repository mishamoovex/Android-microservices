package arctic.fox.registration.data

import javax.inject.Inject
import kotlin.random.Random
import kotlin.random.nextInt

class RegistrationDataSourceImpl @Inject constructor() : RegistrationDataSource {

    private val value = Random.nextInt(0..10)

    override suspend fun register(email: String, pass: String): String {
        return "REGISTERED STATE: $value, cred: $email+$pass"
    }
}