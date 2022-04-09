package arctic.fox.df.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import arctic.fox.df.R
import arctic.fox.df.di.inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        inject()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun navigateToAuth() {
        findNavController(R.id.navHost_main).navigate(
            R.id.action_destination_splash_to_destination_authorization
        )
    }

    fun navigateToRegistration(){
        findNavController(R.id.navHost_main).navigate(
            R.id.action_destination_splash_to_destination_registration
        )
    }

    override fun onBackPressed() {
        val isSuccessful = findNavController(R.id.navHost_main).navigateUp()
        if (!isSuccessful) super.onBackPressed()
    }

}