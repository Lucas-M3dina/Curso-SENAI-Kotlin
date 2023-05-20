class Conta {
    var nomeCliente : String = ""
    var totalCompra : Double = 0.0
    var quantidadeItems : Int = 0
    var produtos : MutableList<Produto> = mutableListOf()

    fun precoCompra(produtos : MutableList<Produto>) : Double{
        for (produto in produtos){
            totalCompra += produto.preco
        }
        return totalCompra
    }
}