class ContaBancaria {
    var agencia: String = ""
    var numeroConta: String = ""
    var saldo: Double = 0.0

    fun sacar(valor : Double) : Double{
        saldo -= valor
        return saldo
    }

    fun depositar(valor : Double) : Double{
        saldo += valor
        return saldo
    }
}