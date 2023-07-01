package com.example.ultimoprojeto.dbo

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.ultimoprojeto.model.Pet

class DBConnect(context : Context) : SQLiteOpenHelper(context,"database.db", null,  1) {

    val sql = arrayOf(
        "CREATE TABLE Pet(id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, raca TEXT, localizacao TEXT, idade INTEGER, tipoIdade TEXT)"
    )

    override fun onCreate(db: SQLiteDatabase) {
        sql.forEach { db.execSQL( it ) }
    }

    override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {
        db.execSQL("DROP TABLE Pet")
        onCreate(db)
    }


    fun AdicionarPet(nome: String, raca: String, localizacao: String, idade: Int, tipoIdade : String){
        val db = this.writableDatabase

        val valoresInsercao = ContentValues()
        valoresInsercao.put("nome", nome)
        valoresInsercao.put("raca", raca)
        valoresInsercao.put("localizacao", localizacao)
        valoresInsercao.put("idade", idade)
        valoresInsercao.put("tipoIdade", tipoIdade)

        db.insert("Pet",null, valoresInsercao)
        db.close()
    }

    fun AlterarPet(id: Int, nome: String, raca: String, localizacao: String, idade: Int, tipoIdade : String){
        val db = this.writableDatabase

        val valoresInsercao = ContentValues()
        valoresInsercao.put("nome", nome)
        valoresInsercao.put("raca", raca)
        valoresInsercao.put("localizacao", localizacao)
        valoresInsercao.put("idade", idade)
        valoresInsercao.put("tipoIdade", tipoIdade)

        db.update("Pet", valoresInsercao, "id=?", arrayOf(id.toString()))
        db.close()
    }

    @SuppressLint("Range")
    fun ListarPet(): ArrayList<Pet>{
        val db = this.readableDatabase
        val comand = db.rawQuery("SELECT * FROM Pet", null)

        val listaPets : ArrayList<Pet> = ArrayList();
        if (comand.count > 0){
            comand.moveToFirst()
            while (comand.moveToNext()){
                val idPet = comand.getInt(comand.getColumnIndex("id"))
                val nomePet = comand.getString(comand.getColumnIndex("nome"))
                val racaPet = comand.getString(comand.getColumnIndex("raca"))
                val localizacaoPet = comand.getString(comand.getColumnIndex("localizacao"))
                val idadePet = comand.getInt(comand.getColumnIndex("idade"))
                val tipoIdadePet = comand.getString(comand.getColumnIndex("tipoIdade"))

                listaPets.add(Pet(idPet, nomePet, racaPet, localizacaoPet, idadePet, tipoIdadePet))

            }
        }

        db.close()

        return listaPets
    }

    fun RemoverPet(id: Int){
        val db = writableDatabase
        db.delete("Pet", "id=?", arrayOf(id.toString()))
    }
}