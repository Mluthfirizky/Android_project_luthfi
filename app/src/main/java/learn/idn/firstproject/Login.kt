package learn.idn.firstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class Login: AppCompatActivity() {

    private lateinit var dataEmail: Array<String>
    private lateinit var dataPassword: Array<String>
    private var progressBar: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        val edtEmail : EditText = findViewById(R.id.edt_email)
        val edtPassword : EditText = findViewById(R.id.edt_password)
        val btnLogin : Button = findViewById(R.id.btn_login)
        val btnRegister : Button = findViewById(R.id.btn_register)
        progressBar = findViewById(R.id.progress)
        val btnForgetPass : TextView = findViewById(R.id.forgot_password)
        val radioRemember : RadioButton = findViewById(R.id.rememberme)

        progressBar?.visibility = View.GONE
        dataEmail = arrayOf("Luthfi", "rizky", "ginting")
        dataPassword = arrayOf("111", "222", "333")

        btnLogin.setOnClickListener{
            signIn(edtEmail.text.toString(), edtPassword.text.toString())
            progressBar?.visibility = View.VISIBLE
        }

        btnRegister.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }


    }

    fun signIn(email:String, Password:String){
        for (i in dataEmail.indices){
            val takeDataEmail = dataEmail.get(i)
            val takeDataPass = dataPassword.get(i)
            if (takeDataEmail == email || takeDataPass == Password){
                Toast.makeText(this, "LogedIn", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, Home::class.java))
                progressBar?.visibility = View.GONE
                break
            }else{
                progressBar?.visibility = View.GONE
                Toast.makeText(this, "Akun salah",Toast.LENGTH_SHORT).show()
            }
        }
    }
}