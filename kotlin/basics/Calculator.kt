package basics

class Calculator {
    private val res: Float = 0F

    fun soma(n1: Float, n2: Float): Float{
        val res = n1 + n2

        return res
    }

    fun sub(n1: Float, n2: Float): Float{
        val res = n1 - n2

        return res
    }

    fun mult(n1: Float, n2: Float): Float{
        val res = n1 * n2

        return res
    }

    fun div(n1: Float, n2: Float): Float{
        val res = n1 / n2

        return res
    }
}