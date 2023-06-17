package com.example.exempocrud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var campoEmail: EditText
    private lateinit var campoNome: EditText

    private var position = -1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listaUsuarios)

        var btn_cadastrar = findViewById<Button>(R.id.btn_cadastrar)
        var btn_alterar = findViewById<Button>(R.id.btn_alterar)
        var btn_remover = findViewById<Button>(R.id.btn_remover)

        campoNome = findViewById<EditText>(R.id.nome)
        campoEmail = findViewById<EditText>(R.id.email)

        var listaUsuarios = ArrayList<Usuario>();

        listView.setOnItemClickListener{
            _, _, position, _ ->
            this.position = position
            campoNome.setText(listaUsuarios[position].nome)
            campoEmail.setText(listaUsuarios[position].email)
        }

        btn_cadastrar.setOnClickListener(){
            var novoUsuario = Usuario(campoNome.text.toString(), campoEmail.text.toString())
            listaUsuarios.add(novoUsuario)

            ListarUsuarios(listaUsuarios)

        }

        btn_remover.setOnClickListener(){
            listaUsuarios = ArrayList<Usuario>();
            RemoverUsuarios(listaUsuarios)
        }

        btn_alterar.setOnClickListener(){

            if (position > -1){
                listaUsuarios[position].nome = campoNome.text.toString()
                listaUsuarios[position].email = campoEmail.text.toString()

                ListarUsuarios(listaUsuarios)
                position = -1
            }else{
                Toast.makeText(this,"Escolha um item para alterar", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun ListarUsuarios(listaNova: ArrayList<Usuario>){
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNova)
        listView.adapter = adapter
        LimparCampos()
    }

    fun RemoverUsuarios(listaVazia: ArrayList<Usuario>){

        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaVazia)
        listView.adapter = adapter
    }

    fun LimparCampos(){
        campoNome.setText("")
        campoEmail.setText("")
    }


}