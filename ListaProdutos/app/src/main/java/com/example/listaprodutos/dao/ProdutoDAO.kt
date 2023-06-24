package com.example.listaprodutos.dao

import com.example.listaprodutos.model.Produto

class ProdutoDAO {

    private val produtos = mutableListOf<Produto>()
    fun ListarProduto() : List<Produto>{
        return produtos.toList()
    }

    fun AdicionarProduto(produto: Produto){
        produtos.add(produto)
    }

    fun RemoverProduto(){

    }
}