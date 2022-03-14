package com.example.dsa_taller01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.dsa_taller01.databinding.ActivityPagoliquidoBinding

class pagoliquido : AppCompatActivity() {

    lateinit var binding: ActivityPagoliquidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPagoliquidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHome.setOnClickListener {

            val intent = (Intent(this, MainActivity::class.java))
            startActivity(intent)
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
    fun onSaveButtonClick(view: View) {
        //Tomando informacion
        val name = findViewById<EditText>(R.id.name)
        val hours = findViewById<EditText>(R.id.hours)

        // intent para pasar datos

        val intent = Intent(this, data::class.java)
        intent.putExtra("Nombre", name.text.toString())
        intent.putExtra("Horas", hours.text.toString().toInt())

        startActivity(intent)


    }
}