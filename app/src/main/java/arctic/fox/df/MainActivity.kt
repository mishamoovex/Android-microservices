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
            R.id.selectAuthMethodF
        )
    }

    override fun onBackPressed() {
        findNavController(R.id.navHost_main).navigateUp()
    }

}