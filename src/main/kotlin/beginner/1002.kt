package beginner

import kotlin.math.pow

fun main(args: Array<String>) {
    val rail = readLine()!!.toDouble()
    val area = 3.14159 * rail.pow(2)
    println("A=${"%.4f".format(area)}")
}