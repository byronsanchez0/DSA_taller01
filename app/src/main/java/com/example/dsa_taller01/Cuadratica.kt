package com.example.dsa_taller01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.dsa_taller01.databinding.ActivityCuadraticaBinding

class Cuadratica : AppCompatActivity() {

    lateinit var binding: ActivityCuadraticaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCuadraticaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val boton= binding.btnCuad


        boton.setOnClickListener {

            val a = binding.etA.text.toString().toInt()
            val b = binding.etB.text.toString().toInt()
            val c = binding.etC.text.toString().toInt()
            val determinante: Double = (b * b - 4.0 * a * c)
            val resul = Math.sqrt(determinante)
               //(-b + Math.sqrt(determinante)) / (2 * a)
            binding.tvResultado.text = "Resultado = "  + ((-b)+ resul) / (2 * a)

        }
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
}