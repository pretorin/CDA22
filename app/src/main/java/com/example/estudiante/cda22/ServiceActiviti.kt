package com.example.estudiante.cda22

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class ServiceActiviti : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_activiti)
        btnServicios.setOnClickListener {
            val intent = Intent(this, ServiceActiviti::class.java)
            startActivity(intent)

            //hola..
        }
    }
}
