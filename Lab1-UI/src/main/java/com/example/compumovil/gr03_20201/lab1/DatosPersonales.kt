package com.example.compumovil.gr03_20201.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_datos_personales.*

class DatosPersonales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_personales)

        val objetoIntent: Intent =intent
        var Nombre = objetoIntent.getStringExtra("Nombre")
        txtNombre.text = "Nombre Completo $Nombre"
    }
}