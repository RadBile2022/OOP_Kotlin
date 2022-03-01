package basicKotlin

//Variable

//constan variable digunakan sebagai dokumentasi aplikasi version
const val APP_VERS = "Aplikasi Versi 1.0"
const val APP_NAME = "Belajar Variable"

//function main
fun main() {
    //Macam-macam variable

    //Mutable = variable yang bisa diganti
    var nama = "ucok"

    println(nama)

    //Imutable = variable yang tidak bisa diganti
    val x = 8
    // x = 9 jika ini di aktifkan maka akan terjadi error
    val y = 7

    println(x+y)
    print(x )
    print (y )



}