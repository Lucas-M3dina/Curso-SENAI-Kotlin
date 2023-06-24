package com.example.listaprodutos.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.controls.actions.FloatAction
import androidx.recyclerview.widget.RecyclerView
import com.example.listaprodutos.R
import com.example.listaprodutos.dao.ProdutoDAO
import com.example.listaprodutos.model.Produto
import com.example.listaprodutos.ui.RecyclerAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dao = ProdutoDAO()

        dao.AdicionarProduto(Produto("Trakinas","Bolacha de limão", BigDecimal(2)))
        dao.AdicionarProduto(Produto("Passatempo","Bolacha de leite", BigDecimal(1)))

        var listaProduto = dao.ListarProduto()

        val listaView = findViewById<RecyclerView>(R.id.recycler_view)

        listaView.adapter = RecyclerAdapter(this, listaProduto)


        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener(){
            val intent = Intent(this, FormularioActivity::class.java)
            startActivity(intent)
        }
    }


}