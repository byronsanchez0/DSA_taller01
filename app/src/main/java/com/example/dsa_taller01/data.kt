package com.example.dsa_taller01

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class data : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagoliquido)

        //trayendo el intent y los datos del itnent

        val intent = getIntent()
        val name = intent.getStringExtra("Nombre")
        val hours = intent.getIntExtra("Horas", 0)
        val sneto = hours*8.50-((hours*8.50*0.02)+(hours*8.50*0.03)+(hours*8.50*0.04))
        val iss= hours*8.50*0.02
        val afp= hours*8.50*0.03
        val renta=  hours*8.50*0.04

        findViewById<TextView>(R.id.neto_tv).text = "Nombre: " + name + "\n\nHoras trabajadas en el mes: " + hours + "\n\nSalario neto: " + sneto +"\n\nDescuento del ISS: "+iss+"\n\nDescuento de AFP: "+afp+"\n\nDescuento renta: "+ renta
    }
}