package basicKotlin

fun main() {
    //operasi standar kalkulator
    val plus :Int = 20+3
    println(plus)

    val minus = 5.2-3.0
    println(minus)

    val kali = 6*6.23//input 2 tipe number berbeda
    println(kali)//output akan mengikuti hasil dari inputan

    val devide = 10.0 / 3.0 //pembagian
//    println(devide)//output akan mengikuti hasil input (tipe datanya)
    println(devide.toFloat()) //bisa juga di konversi tipe datanya

    val modulo = 100 % 3//menggunakan char%
    println(modulo)//sisa bagi

    //Operasi scientifix (seperti kalkulator)
    val multiple = 5+10*10
    println(multiple)

    //Operasi Augmented Assignments
    var total = 0
    var hargaBarang = 500
    var jumlahBarang = 5

    //standar perhitungan operasi
//    total = total+hargaBarang

    //menggunakan augmented assignments
    total +=hargaBarang //plus
    println("Harga Barang Satuan : " + total)

    //jumlah barang (menggunakan augmented assignments)
    hargaBarang *= jumlahBarang
    println("Harga total pembelian :" + hargaBarang)

    //UNARY OPERATOR
    // ++ => increment, -- => decrement
    println (++hargaBarang) //increment
    println (--hargaBarang) //decrement
    println (--hargaBarang) //decrement

    val suhu = -10 //negative
    println(suhu)

    //operasi perbandingan
    val Jenny = true //operator not !
    println(!Jenny)
}