package basicKotlin

//tanpa lamda
fun proglatUnggulan (proglat1 :String, proglat2 :String, operation: (String, String) -> String) :String{
    val result = operation(proglat1, proglat2)
    println(result)
    return result
}

fun main() {
    //menggunakan lamda untuk named argument
    val duaProglatUnggulan = {a: String, b:String, -> "Program Pelatihan TIK yaitu $a dan $b"}
    proglatUnggulan("Mobile Programming", "IT Software", operation = duaProglatUnggulan)

    //cara lebih ringkas menggunakan lamda
    proglatUnggulan("Mobile Programming", "IT Software", {a: String, b:String -> "Program Pelatihan TIK yaitu $a dan $b"})

    //
}
