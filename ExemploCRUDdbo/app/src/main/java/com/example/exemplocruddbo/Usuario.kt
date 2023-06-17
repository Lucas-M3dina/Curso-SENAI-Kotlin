package com.example.exempocrud

class Usuario(var id : Int, var nome : String, var email : String) {

    override fun toString(): String {
        return "Usuario - Id: $id Name: $nome e Email: $email"
    }
}