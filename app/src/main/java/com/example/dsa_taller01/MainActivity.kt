package com.example.dsa_taller01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.dsa_taller01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

lateinit var binding: ActivityMainBinding
lateinit var usersDBHelper: misqLitehelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        usersDBHelper = misqLitehelper(this)

        binding.btnLogin.setOnClickListener {
            if(binding.etUser.text.isNotBlank() &&
                    binding.etPwd.text.isNotBlank()){
                usersDBHelper.addData(binding.etUser.text.toString(),
                    binding.etPwd.text.toString())
                binding.etUser.text.clear()
                binding.etPwd.text.clear()
                Toast.makeText(this, "Guardado", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "No se ha podido guardar", Toast.LENGTH_LONG).show()
            }
        }
        binding.btnCuadratica.setOnClickListener {

                val intent = (Intent(this, Cuadratica::class.java))
                startActivity(intent)
        }
        binding.btnVotos.setOnClickListener {

            val intent = (Intent(this, Votos::class.java))
            startActivity(intent)

        }
        binding.btnPago.setOnClickListener {

            val intent = (Intent(this, pagoliquido::class.java))
            startActivity(intent)

        }

    }
}