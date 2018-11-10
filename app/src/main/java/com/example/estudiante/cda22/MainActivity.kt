package com.example.estudiante.cda22

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAcerca.setOnClickListener { layoutPrincipal.textNombre.text = btnAcerca.text }
        btnPortafolio.setOnClickListener { layoutPrincipal.textNombre.text = btnPortafolio.text }
        btnServicios.setOnClickListener { layoutPrincipal.textNombre.text = btnServicios.text }
        btnContacto.setOnClickListener { layoutPrincipal.textNombre.text = btnContacto.text }
        btnRedes.setOnClickListener { layoutPrincipal.textNombre.text = btnRedes.text }
    }

}
