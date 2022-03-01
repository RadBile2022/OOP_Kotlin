package basicKotlin

fun main() {
    //Input Menggunakan Readline()
    println("masukan nama : ")
    val nama = readln() //inputan readline menggantikan langsung propertiesnya
    println("masukan umur : ")
    val umur = readln()!!.toInt() //merubah string (defaul readline) ke integer
    println("Hai nama kamu adalah $nama dan umur kamu ${umur+2}")

}