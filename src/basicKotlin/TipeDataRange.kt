package basicKotlin

fun main() {
    val range = 1 ..100  step 2 //range 1 - 100 dengan step 2

    println(range.count())
    println(range.contains(49)) //nilainya berupa boolean
    println(range.contains(101)) //nilainya berupa boolean
    println(range.first)
    println(range.last)
    println(range.step) //kelipatan nilainya
    println(range.joinToString())
}