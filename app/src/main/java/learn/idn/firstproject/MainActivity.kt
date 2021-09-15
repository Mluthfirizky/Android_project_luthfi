package learn.idn.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity: AppCompatActivity() {

    private lateinit var dataEmail: Array<String>
    private lateinit var dataPassword: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtEmail : EditText = findViewById(R.id.edt_email)
        val edtPassword : EditText = findViewById(R.id.edt_password)
        val btnLogin : Button = findViewById(R.id.btn_login)
        val btnRegister : Button = findViewById(R.id.btn_register)
        val btnForgetPass : TextView = findViewById(R.id.forgot_password)
        val radioRemember : RadioButton = findViewById(R.id.rememberme)

        dataEmail = arrayOf("Luthfi", "rizky", "ginting")
        dataPassword = arrayOf("111", "222", "333")

        btnLogin.setOnClickListener{
            signIn(edtEmail.text.toString(), edtPassword.text.toString())
        }

    }

    fun signIn(email:String, Password:String){
        for (i in dataEmail.indices){
            val takeDataEmail = dataEmail.get(i)
            val takeDataPass = dataPassword.get(i)
            if (takeDataEmail == email || takeDataPass == Password){
                Toast.makeText(this, "LogedIn", Toast.LENGTH_SHORT).show()
                break
            }else{
                Toast.makeText(this, "Akun salah",Toast.LENGTH_SHORT).show()
            }
        }
    }
}