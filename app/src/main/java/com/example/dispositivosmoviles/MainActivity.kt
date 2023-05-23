package com.example.dispositivosmoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var botonUno = findViewById<Button>(R.id.boton1)
        var txtBuscar = findViewById<TextView>(R.id.txt_buscar)

        botonUno.text = "INGRESAR"
        botonUno.setOnClickListener{
            txtBuscar.text = "El evento se ha ejecutado"
            Toast.makeText(this,"Esto es un ejemplo", Toast.LENGTH_SHORT).show()
        }

        var f = Snackbar.make(botonUno, "Este es otro mensaje",Snackbar.LENGTH_LONG)

        f.show()
    }
}