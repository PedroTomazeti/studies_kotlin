package basics

fun main(){
    val read = InputReader()
    val calc = Calculator()
    print("Insira o primeiro número: ")
    val num1 = read.input<Float>()
    print("Insira o segundo número: ")
    val num2 = read.input<Float>()

    val soma = calc.soma(num1, num2)
    val sub = calc.sub(num1, num2)
    val mult = calc.mult(num1, num2)
    val div = calc.div(num1, num2)

    println("Soma: $soma, Subtração: $sub, Multiplicação: $mult, Divisão: $div .")

    read.close()
}