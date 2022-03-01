package OOP



import OOP.Motor
//============ IMPORT DATA ============
//============ Contoh import object dengan banyak data ============

fun main() {
    val motorSaya = Motor ()

    motorSaya.merk = "Honda"
    motorSaya.tipe = "Vario 125"
    motorSaya.tahun = 2019

    val motorTeman = Motor ()

    motorTeman.merk = "Yamaha"
    motorTeman.tipe = "Nmax 155"
    motorTeman.tahun = 2020

    println (motorSaya.merk) // Honda
    println (motorTeman.merk) // Yamaha

}


//============ Contoh import object dengan 1 data ============
//fun main() {
//    //Membuat object motor saya dari class motor
//    val motorSaya = Motor ()
//
//    //Mengakses porperti dari class Motor dan mengisi value objek motorSaya
//    motorSaya.merk = "Honda"
//    motorSaya.tipe = "Vario 125"
//    motorSaya.tahun = 2019
//
//    println(motorSaya.merk) //output Honda
//    println(motorSaya.tipe) //output Vario 125
//    println(motorSaya.tahun) //output 2019
//}