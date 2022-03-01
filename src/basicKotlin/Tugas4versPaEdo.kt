package basicKotlin

fun main() {
    //buat variable
    val kodeBaju = 2
    val ukuranBaju = "L".toUpperCase()
    val merkBaju1 = "IMP"
    val merkBaju2 = "Prada"
    val merkBaju3 = "Gucci"
    val merkBaju4 = "Louis Vitton"
    val merkBaju5 = "Kick Denim"

    //eksekusi menggunakan nested if else
    if (kodeBaju == 1) {
        println("Merk Baju =" + merkBaju1)
        if (ukuranBaju == "S") {
            println("Ukuran $ukuranBaju, Harga : 200.000")
        } else if (ukuranBaju == "M") {
            println("Ukuran $ukuranBaju, Harga : 220.000")
        } else if (ukuranBaju != "S" || ukuranBaju != "M") {
            println("Ukuran $ukuranBaju, Harga : 250.000")
        }
    }
    if (kodeBaju == 2) {
        println("Merk Baju =" + merkBaju2)
        if (ukuranBaju == "S") {
            println("Ukuran $ukuranBaju, Harga : 200.000")
        } else if (ukuranBaju == "M") {
            println("Ukuran $ukuranBaju, Harga : 220.000")
        } else if (ukuranBaju != "S" || ukuranBaju != "M") {
            println("Ukuran $ukuranBaju, Harga : 250.000")
        }
    }

}