package com.example.exemplocruddbo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
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

        var idRemove = -1

        var lista = findViewById<ListView>(R.id.listaUsuarios)
        lista.setOnItemClickListener{ _, _, position, _ ->
            val lista = dbo.ListarUsuarios();
            findViewById<EditText>(R.id.nome).setText("${lista[position].nome}")
            findViewById<EditText>(R.id.email).setText("${lista[position].email}")
            idRemove = lista[position].id
        }



        val btn_inserir = findViewById<Button>(R.id.btn_cadastrar)

        btn_inserir.setOnClickListener(){
            val nomeUsuario = findViewById<EditText>(R.id.nome).text.toString()
            val emailUsuario = findViewById<EditText>(R.id.email).text.toString()

            dbo.InserirUsuario(nomeUsuario, emailUsuario)

            val listaUsuario = dbo.ListarUsuarios()
            ListarUsuarios(listaUsuario)
        }

        val btn_remover = findViewById<Button>(R.id.btn_remover)
        btn_remover.setOnClickListener(){
            if (idRemove == -1){
                Toast.makeText(this,"Algo deu errado, tente selecionar um item da lista abaixo", Toast.LENGTH_SHORT).show()
            }
            dbo.RemoverUsuario(idRemove)
            idRemove = -1
            val listaUsuario = dbo.ListarUsuarios()
            ListarUsuarios(listaUsuario)


        }

        val btn_alterar = findViewById<Button>(R.id.btn_alterar)
        btn_alterar.setOnClickListener(){
            val nomeUsuario = findViewById<EditText>(R.id.nome).text.toString()
            val emailUsuario = findViewById<EditText>(R.id.email).text.toString()

            dbo.AtualizarUsuario(idRemove.toString(), nomeUsuario, emailUsuario)

            val listaUsuario = dbo.ListarUsuarios()
            ListarUsuarios(listaUsuario)

            findViewById<EditText>(R.id.nome).setText("")
            findViewById<EditText>(R.id.email).setText("")
        }


    }

    fun ListarUsuarios(listaNova: ArrayList<Usuario>){
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNova)
        listView.adapter = adapter
    }



}