package basicKotlin

fun main(){
    LuasSegitiga(6,7)
    KelilingLing(8)
    NilaiMahasiswa(80,80)
}
//function Luas Segitiga

//JAWABAN NO. 1
fun LuasSegitiga(alas:Int, tinggi: Int): Double{
    //rumus luas alas segitiga = 1/2 * alas * tinggi
    val luas = 0.5 * alas * tinggi
    println("Luas segitiga siku - siku = $luas")
    return luas
}

//JAWABAN NO. 2
fun KelilingLing(jarijari:Int){
    val phi = 3.14
    val keLing = 2 * phi * jarijari
    println("Keliling Lingkarannya adalah = $keLing")
}

//JAWABAN NO. 3 dan 4
fun NilaiMahasiswa(nilai1: Int, nilai2 : Int){
    //Jawaban No.3
    if (nilai1 >= 80){
        println("Lulus")
    } else if (nilai1 < 80){
        println("Cukup")
    } else if (nilai1 >= 60 && nilai1 <80 ) {
        println ("Silahkan ulang lagi di tahap berikutnya")
    }
    //jawaban No, 4
    if (nilai2 >= 80){
        println ('A')
    } else if (nilai2 in 70 .. 80){
        println("B+")
    } else if (nilai2 in 60..70){
        println('B')
    } else if (nilai2 < 60){
        println("C+")
    }
}