package com.example.dispositivosmoviles.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.dispositivosmoviles.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    //se enlaza el binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //crea los objetos o a inflar
        //layoutInflater -> Se crean objetos asociados
        //Inicializa el binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        //Poner los objetos en la clase
        setContentView(binding.root)

    }

    //Por buenas practicas de programcion poner las clases en onStart
    override fun onStart() {
        super.onStart()
        initClass()

        //ejemplo
        //initServices()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun initClass() {
        //var boton2 = binding.botonUno
        //No es necesario crear variables al usar biding
        binding.botonUno.setOnClickListener {
            //txtBuscar.text = "El evento se ha ejecutado"
            //Toast.makeText(this,"Esto es un ejemplo", Toast.LENGTH_SHORT).show()
            //binding.txtBuscar.text="El codigo ejecuta correctamente"

            //this-> de esta activity
            //ir a la otra MainActivity2::class.java
            var intent = Intent(
                this,
                PrincipalActivity::class.java
            )

            //enviar datos a otra activity
            //se compone de clave-valor
            intent.putExtra("var1", binding.txtBuscar.text.toString())

            //iniciar el objeto intent
            startActivity(intent)

        }


        /*var botonUno = findViewById<TextView>(R.id.botonUno)
        var txtBuscar = findViewById<TextView>(R.id.txt_buscar)

        botonUno.text = "INGRESAR"
        botonUno.editableText.clear()

        botonUno.setOnClickListener{
            txtBuscar.text = "El evento se ha ejecutado"
            Toast.makeText(this,"Esto es un ejemplo", Toast.LENGTH_SHORT).show()
        }*/

        /*var f = Snackbar.make(binding.botonUno, "Este es otro mensaje",Snackbar.LENGTH_LONG)

        f.show()*/


    }

    private fun initServices(){

    }
}