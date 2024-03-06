package basics

import java.util.Scanner

class InputReader {
    val sc = Scanner(System.`in`)
    // Função genérica para entrada de qualquer tipo de dado
    inline fun <reified G> input(): G{
        // Verifica o tipo de T em tempo de execução
        return when(G::class){
            // Se T for do tipo Int, lê e retorna um Int
            Int::class -> sc.nextInt() as G
            // Se T for do tipo Float, lê e retorna um Float
            Float::class -> sc.nextFloat() as G
            // Se T for do tipo Double, lê e retorna um Double
            Double::class -> sc.nextDouble() as G
            // Se T for do tipo String, lê e retorna um String
            String::class -> sc.next() as G
            // Se T for algum formato não reconhecido
            else -> throw IllegalArgumentException("Tipo do dado não suportado, tente novamente.")
        }
    }

    fun close(){
        sc.close()
    }
}