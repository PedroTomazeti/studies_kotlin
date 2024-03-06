package basics

fun main(){
    val read = InputReader()
    print("Olá, insira seu nome por favor: ")
    val nome = read.input<String>()
    println("Obrigado por acessar e apoiar $nome!")

    read.close()
}