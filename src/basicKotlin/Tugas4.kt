package basicKotlin

fun main() {
    val kodeBaju = 1
    val ukuranBaju: Char = 'A'

    if (kodeBaju == 1) {
        println("Merk Baju = IMP")
    }
    else if (ukuranBaju == 'S') {
        println("Harga Baju : 200.000")
    } else if (ukuranBaju == 'M') {
        println("Harga Baju : 220.000")
    } else {
        print("Harga Baju : 250.000")
    }

    if (kodeBaju == 2) {
        println("Merk Baju = Prada")
    }
    else if (ukuranBaju == 'S') {
        println("Harga Baju : 150.000")
    } else if (ukuranBaju == 'M') {
        println("Harga Baju : 160.000")
    } else {
        print("Harga Baju : 170.000")
    }

    if (kodeBaju == 3) {
        println("Merk Baju = Gucci")
    }
    else if (ukuranBaju == 'S') {
        println("Harga Baju : 200.000")
    } else if (ukuranBaju == 'M') {
        println("Harga Baju : 220.000")
    } else {
        print("Harga Baju : 250.000")
    }

}