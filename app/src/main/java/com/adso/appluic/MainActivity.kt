package com.adso.appluic

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Button
import android.content.Intent



class MainActivity : AppCompatActivity() {

    private lateinit var Email: EditText
    private lateinit var Password: EditText
    private lateinit var button2: Button

    private var usuario = ""
    private var contraseña = ""

    private val datosusuario = "coden@gmail.com"
    private val datoscontraseña = "coden"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Email = findViewById(R.id.Email)
        Password = findViewById(R.id.Password)
        button2 = findViewById(R.id.button2)

        button2.setOnClickListener {
            usuario = Email.text.toString()
            contraseña = Password.text.toString()

            if (usuario.isEmpty()) {
                Email.setError("campo vacio")
            } else if (usuario != datosusuario) {
                Email.setError("usuario incorrecto")
            } else {
                Email.setError(null)
            }

            if (contraseña.isEmpty()) {
                Password.setError("campo vacio")
            } else if (contraseña != datoscontraseña) {
                Password.setError("contraseña incorrecto")
            } else {
                Password.setError(null)
            }

            if (usuario == datosusuario && contraseña == datoscontraseña) {

                val intent = Intent(this@MainActivity, VideoViewRaw::class.java)
                startActivity(intent)


                Toast.makeText(this, "BIENVENIDO", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
