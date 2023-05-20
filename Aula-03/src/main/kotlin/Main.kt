import java.util.Scanner
import kotlin.math.sign

fun main() {
    val scan = Scanner(System.`in`);
//    val usuario = Usuario("Lucas", "lucas@gmail.com", 18)
//
//    println(usuario.nome + usuario.email + usuario.idade)

    // val scan = Scanner(System.`in`);
    // println("Digite o nome do ${i + 1}° produto");
    // MutableList<TIPOVALOR> = mutableListOf()

    //1 Crie um sistema de lista de alunos, onde cada aluno possua uma média

//    var notas : MutableList<Double> = mutableListOf()
//    var alunos : MutableList<Aluno> = mutableListOf()
//    var aluno : Aluno;
//    var nome : String;
//    var resposta: Int = 1;
//
//    println("Digite o nome do aluno")
//    nome = scan.next();
//
//     while (resposta == 1){
//         println("Digite uma nota do aluno ${nome}")
//         notas.add(scan.nextDouble())
//
//
//         println("Você deseja cadastrar outra nota? \n [1] Sim           [2] Não")
//         resposta = scan.nextInt();
//     }
//    aluno = Aluno(nome, notas)
//
//    println("A média das notas do aluno ${aluno.nome} é ${aluno.mediaNotas(notas)}")



    //2. Crie um sistema de pets onde tenha um dono de pet tenha um nome e um número de contato, e tenha uma lista de pets com os parâmetros, nome, raça e idade;

//    var donos : MutableList<DonoPet> = mutableListOf()
//    var dono = DonoPet();
//
//    var resposta: Int = 1;
//    var resposta2: Int = 1;
//
//    while (resposta2 == 1) {
//        resposta = 1;
//        var dono = DonoPet();
//        println("Digite o nome do Dono")
//        dono.nome = scan.next();
//
//        println("Digite o numero do Dono")
//        dono.numero = scan.next();
//
//        while (resposta == 1) {
//            var pet = Pet()
//            println("Digite o nome do PET do ${dono.nome}")
//            pet.nome = scan.next()
//
//            println("Digite a raça do PET do ${dono.nome}")
//            pet.raca = scan.next()
//
//            println("Digite a idade do PET do ${dono.nome}")
//            pet.idade = scan.nextInt()
//
//            dono.animais.add(pet);
//
//            println("Você deseja cadastrar outro pet? \n [1] Sim           [2] Não")
//            resposta = scan.nextInt();
//        }
//
//        donos.add(dono)
//
//        println("Você deseja cadastrar outro dono? \n [1] Sim           [2] Não")
//        resposta2 = scan.nextInt();
//    }
//
//    for (dono in donos) {
//        println(" O dono com o nome ${dono.nome} e numero ${dono.numero} possui ${dono.animais.size} pets, e estão listados a seguir:")
//        for (pet in dono.animais) {
//            println("É dono do pet ${pet.nome} da raça ${pet.raca} que tem ${pet.idade}")
//        }
//    }


    //3. Crie um sistema de compras onde tenha uma Classe conta, com os atributos nome do cliente, total da compra e quantidade de itens e uma lista de produtos com nome do produto, marca e o preço do produto

//    var clientes : MutableList<Conta> = mutableListOf()
//    var resposta: Int = 1;
//    var resposta2: Int = 1;
//
//    while (resposta2 == 1) {
//        resposta = 1;
//        var conta = Conta();
//        println("Digite o nome do Cliente")
//        conta.nomeCliente = scan.next();
//
//
//        while (resposta == 1) {
//            var produto = Produto()
//            println("Digite o nome do produto comprado por ${conta.nomeCliente}")
//            produto.nome = scan.next()
//
//            println("Digite a marca do produto comprado por ${conta.nomeCliente}")
//            produto.marca = scan.next()
//
//            println("Digite o preco do produto comprado por ${conta.nomeCliente}")
//            produto.preco = scan.nextDouble();
//
//            conta.produtos.add(produto);
//
//            println("Você deseja cadastrar outro produto? \n [1] Sim           [2] Não")
//            resposta = scan.nextInt();
//        }
//
//        conta.quantidadeItems = conta.produtos.size;
//        conta.totalCompra = conta.precoCompra(conta.produtos)
//
//        clientes.add(conta)
//
//        println("Você deseja cadastrar outra compra? \n [1] Sim           [2] Não")
//        resposta2 = scan.nextInt();
//    }
//
//    for (conta in clientes) {
//        println("\nO Cliente com o nome ${conta.nomeCliente} comprou ${conta.quantidadeItems} produtos, e estão listados a seguir:")
//        for (produto in conta.produtos) {
//            println("- Pagou R$ ${produto.preco} no produto ${produto.nome} da marca ${produto.marca}")
//        }
//    }



    //4. Crie um sistema de contas bancárias, onde informamos a agência número da conta e o total da conta, e possamos sacar um dinheiro ou depositar um valor na conta

//    var resposta: Int = 1;
//    var resposta2: Int = 1;
//    var resposta3 : Int = 0;
//
//    while (resposta2 == 1) {
//        resposta = 1;
//        var conta = ContaBancaria();
//        println("Digite a agencia da conta")
//        conta.agencia = scan.next();
//
//        println("Digite o numero da conta")
//        conta.numeroConta = scan.next();
//
//        println("Digite o saldo da conta")
//        conta.saldo = scan.nextDouble();
//
//
//        while (resposta == 1) {
//
//            println("Qual operação voce gostaria de realizar? \n [1] Sacar           [2] Depositar           [0]Sair")
//            resposta3 = scan.nextInt();
//
//            if (resposta3 == 1){
//                println("Quanto você deseja sacar?")
//                var sacado = scan.nextDouble();
//                println("\nFoi sacado R$ ${sacado} da sua conta e agora seu saldo é de ${conta.sacar(sacado)}\n")
//            }else if (resposta3 == 2){
//                println("Quanto você deseja depositar?")
//                var depositado = scan.nextDouble();
//                println("\nFoi depositado R$ ${depositado} na sua conta e agora seu saldo é de ${conta.depositar(depositado)}\n")
//            }else{
//                break
//            }
//
//            println("Você deseja cadastrar Realizar outra operação? \n [1] Sim           [2] Não")
//            resposta = scan.nextInt();
//        }
//
//
//        println("Você deseja acessar outra conta? \n [1] Sim           [2] Não")
//        resposta2 = scan.nextInt();
//    }



    //5. Crie um sistema de tarefas diárias, onde tenha os seguintes atributos, tipo de atividade, nome da atividade, status de realização da atividade. Nesse sistema podemos adicionar uma nova atividade e podemos alterar uma atividade para completa ou incomplet

    var atividades : MutableList<Atividade> = mutableListOf()
    var resposta: Int = 1;
    var resposta2: Int = 1;
    var resposta3 : Int = 0;

    while (resposta2 == 1) {
        resposta = 1;

        println("Digite a opção que você deseja: \n  [1] Criar tarefa       [2] Listar tarefas       [3] Sair")
        var resp = scan.nextInt();

        if (resp == 1){
            while (resposta == 1) {

                var atividade = Atividade();
                println("Digite o nome da tarefa")
                atividade.nome = scan.next();

                println("Digite o tipo da tarefa")
                atividade.tipoAtividade = scan.next();

                println("Qual o status da tarefa? \n   [1] Completa          [2] Incompleta")
                if (scan.nextInt() == 1) atividade.completarTarefa() else atividade.incompletaTarefa()
                atividades.add(atividade)

                println("Você deseja cadastrar outra tarefa? \n [1] Sim           [2] Não")
                resposta = scan.nextInt();
            }
        } else if(resp == 2){
            println("Todas as tarefas estão listadas abaixo ")
            for (tarefa in atividades){
                println("- A tarefa ${tarefa.nome} do tipo ${tarefa.tipoAtividade} e está no estado ${tarefa.status} ")
            }
        }else {
            break
        }



        println("Você deseja voltar ao menu? \n [1] Sim           [2] Não")
        resposta2 = scan.nextInt();
    }


}