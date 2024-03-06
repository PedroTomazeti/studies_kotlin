package basics

fun main(){
    val read = InputReader()
    print("Digite o número desejado: ")
    val num = read.input<Int>()

    val str = when {
        num < 0 -> "O número $num é negativo."
        num == 0 -> "O número inserido é 0."
        num > 0 -> "O número $num é positivo."
        else -> throw IllegalArgumentException("Tipo não reconhecido para a operação.")
    }

    println(str)
}