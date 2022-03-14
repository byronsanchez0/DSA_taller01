package com.example.dsa_taller01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dsa_taller01.databinding.ActivityVotosBinding

class Votos : AppCompatActivity() {

    lateinit var binding: ActivityVotosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVotosBinding.inflate(layoutInflater)
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
}