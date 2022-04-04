package arctic.fox.df

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun navigateToAuth() {
        findNavController(R.id.navHost_main).navigate(
            R.id.action_destination_splash_to_destination_authorization
        )
    }

    override fun onBackPressed() {
        val isSuccessful = findNavController(R.id.navHost_main).navigateUp()
        if (!isSuccessful) super.onBackPressed()
    }

}