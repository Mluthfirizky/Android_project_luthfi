package learn.idn.firstproject

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Home: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.bahasa -> {
                Toast.makeText(this, "pengaturan Bahasa", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.tampilan -> {
                Toast.makeText(this, "pengaturan Tampilan", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.logout -> {
                startActivity(Intent(this, Login::class.java))
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }

}