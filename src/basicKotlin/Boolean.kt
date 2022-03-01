package basicKotlin

fun main() {
    // Boolean

    // bisa val / var
    val t :Boolean = true
    val f :Boolean = false

    // memastikan benar / salah tabel kebenaran
    // Conjunction

    println (t.and(f)) //Conjunction
    println (t && f) //lazy conjunction
    println (t.or(f)) //disconjunction
    println (t||f) //lazy conjuntion

    println(!t) //negation true *false
    println(t.not()) //negation true *false
    println(!f) //negation false *true
    println(f.not()) //negation false *true

    println(t.xor(f)) //xor true/false *true
    println(f.xor(t)) //xor true/false *true

}