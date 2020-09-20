package com.example.compumovil.gr03_20201.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_datos_personales.*

class DatosPersonales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_personales)

        val objetoIntent: Intent=intent
        var Nombre = objetoIntent.getStringExtra("Nombre")
        var Apellido = objetoIntent.getStringExtra("Apellido")
        txtNombre.text = "Nombre Completo $Nombre $Apellido"
        var SexoM = objetoIntent.getStringExtra("Sexo")
        txtSexo.text = "Sexo $SexoM"
        var SexoF = objetoIntent.getStringExtra("Sexo")
        txtSexo.text = "Sexo $SexoF"
        var Fecha = objetoIntent.getStringExtra("Fecha")
        txtFech.text = "Fecha $Fecha"
    }
}