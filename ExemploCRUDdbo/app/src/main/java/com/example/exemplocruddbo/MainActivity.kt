package com.example.exemplocruddbo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.exempocrud.Usuario

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listaUsuarios)

        val dbo = DBConnect(this);
        val listaUsuario = dbo.ListarUsuarios()
        ListarUsuarios(listaUsuario)
    }

    fun ListarUsuarios(listaNova: ArrayList<Usuario>){
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNova)
        listView.adapter = adapter
    }
}