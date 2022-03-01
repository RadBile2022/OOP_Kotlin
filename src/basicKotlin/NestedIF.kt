package basicKotlin

fun main() {
    val nilaiRekrut = 70
    val nilaiWawancara = 30

    if (nilaiRekrut == 80) {
        println("Lulus".toUpperCase()) //statement 1

        //nested if expression
        if (nilaiRekrut >= 80 && nilaiWawancara <= 100) { //kondisi 1.1
            println("Dapat dipertimbangkan ikut Pelatihan".toUpperCase()) //statment 1.2
        } else { //kondisi 1.3
            println("tidak dipertimbangkan".toUpperCase())  //kondisi statemnt 1.3
        }
        } else {
            println("tidak lulus".toUpperCase())
        }
    }