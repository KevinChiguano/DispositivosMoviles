package com.example.dispositivosmoviles.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dispositivosmoviles.R
import com.example.dispositivosmoviles.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Inicializa el binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        //Poner los objetos en la clase
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()
    }
}