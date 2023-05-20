class Atividade {
    var nome : String = ""
    var tipoAtividade : String = ""
    var status : String = ""

    fun completarTarefa(){
        status = "completa"
    }

    fun incompletaTarefa(){
        status = "incompleta"
    }
}