package com.example.ultimoprojeto.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.ultimoprojeto.R
import com.example.ultimoprojeto.adapter.ReciclerAdapter
import com.example.ultimoprojeto.dbo.DBConnect

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = DBConnect(this)

        val lista = findViewById<RecyclerView>(R.id.recyclerView)

        lista.adapter = ReciclerAdapter(this, db.ListarPet() )

        val btnAdd = findViewById<Button>(R.id.btnAdd)

        btnAdd.setOnClickListener(){
            val intent = Intent(this,FormActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()

        setContentView(R.layout.activity_main)

        val db = DBConnect(this)

        val lista = findViewById<RecyclerView>(R.id.recyclerView)

        lista.adapter = ReciclerAdapter(this, db.ListarPet() )

        val btnAdd = findViewById<Button>(R.id.btnAdd)

        btnAdd.setOnClickListener(){
            val intent = Intent(this,FormActivity::class.java)
            startActivity(intent)
        }
    }
}