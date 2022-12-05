package com.example.kotlin_toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto_a_ser_exibido = "Olá Gui! Seja Bem-vindo."
        val duracao = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, texto_a_ser_exibido, duracao)

        toast.show()
    }
}