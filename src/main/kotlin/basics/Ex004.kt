package basics

fun main(){
    val read = InputReader()

    print("Digite um número inteiro: ")
    val num = read.input<Int>()
    if (num % 2 == 0){
        println("O número $num é par.")
    } else {
        println("O número $num é ímpar")
    }

    read.close()
}