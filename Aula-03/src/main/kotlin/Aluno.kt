class Aluno {

    var nome : String;
    var notas : MutableList<Double> = mutableListOf();
    var media : Double = 0.0

    constructor(nome: String, notas: MutableList<Double>,){
        this.nome = nome
        this.notas = notas
    }

    fun mediaNotas(notas: MutableList<Double>) : Double {
        var total = 0.0;
        for (nota in notas){
            total += nota
        }

        return (total / notas.size)
    }
}