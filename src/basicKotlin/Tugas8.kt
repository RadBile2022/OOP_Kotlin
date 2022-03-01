package basicKotlin

fun main() {
    apl()
}
fun apl(){
    println("==========Menghitung Luas dan Keliling Bangun Datar==========")
    println("1. Menghitung Luas")
    println("2. Menghitung Keliling")
    println("3. Keluar")
    println("Pilih menu yang anda inginkan : ")
    val menuUtama = readln()
    if (menuUtama == "1"){
        menuluas()
    } else if (menuUtama == "2"){
        menukeliling()
    } else if (menuUtama == "3") {
        println("terima kasih telah menggunakan aplikasi ini")
    } else {
        println("pilihan yang anda masukan tidak ada")
        println("")
        apl()
    }
}
//menu luas
fun menuluas(){
    println("==========Menghitung Luas Bangun Datar==========")
    println("1. Menghitung Luas Persegi")
    println("2. Menghitung Luas Persegi Panjang")
    println("3. Menhitung Luas Lingkaran")
    println("Pilih menu yang anda inginkan : ")
    val menuluas = readln()
    if (menuluas == "1"){
        luaspersegi()
    } else if (menuluas == "2"){
        luaspersegipanjang()
    } else if (menuluas == "3"){
        LuLing()
    }else{
        println ("menu yang anda masukan tidak ada")
        apl()
    }
}
//luas persegi
fun luaspersegi(){
    println("==========Menghitung Luas Persegi==========")
    println("Masukan panjang sisi : ")
    val sisi = readln()!!.toInt()
    val luaspersegi = 2 * sisi
    println ("Luas Persegi adalah : $luaspersegi")
    apl()
}
//luas persegi panjang
fun luaspersegipanjang(){
    println("==========Menghitung Luas Persegi Panjang==========")
    println("Masukan Panjang = ")
    val panjang = readln()!!.toInt()
    println("Masukan Lebar = ")
    val lebar = readln()!!.toInt()
    val luaspersegipanjang = panjang * lebar
    println("Luas Persegi Panjang adalah : $luaspersegipanjang")
    apl()
}
//luas lingkaran
fun LuLing(){
    println("==========Menghitung Luas Lingkaran==========")
    println("Masukan nilai jari - jari = ")
    val jarijari = readln()!!.toInt()
    val phi = 3.14
    val LuLing = phi * (jarijari * 2)
    println ("Luas Lingkaran adalah : $LuLing")
    apl()
}
//menu keliling
fun menukeliling(){
    println("==========Menghitung Keliling Bangun Datar==========")
    println("1. Menghitung Keliling Persegi")
    println("2. Menghitung Keliling Panjang")
    println("3. Menhitung Keliling Lingkaran")
    println("Pilih menu yang anda inginkan : ")
    val menukeliling = readln()
    if (menukeliling == "1"){
        KelPersegi()
    } else if (menukeliling == "2"){
        KelPersegiPanjang()
    } else if (menukeliling == "3"){
        keLing()
    }else{
        println ("menu yang anda masukan tidak ada")
        apl()
    }
}
//keliling persegi
fun KelPersegi (){
    println("==========Menghitung Keliling Persegi==========")
    println("Masukan panjang sisi : ")
    val sisi = readln()!!.toInt()
    val KelPersegi = 4 * sisi
    println ("Keliling Persegi adalah : $KelPersegi")
    apl()
}
//keliling persegi panjang
fun KelPersegiPanjang (){
    println("==========Menghitung Keliling Persegi Panjang==========")
    println("Masukan ukuran panjang : ")
    val panjang = readln()!!.toInt()
    println("Masukan ukuran lebar : ")
    val lebar = readln()!!.toInt()
    val KelPersegiPanjang = 2 * ( panjang + lebar)
    println("Keliling persegi panjang adalah : $KelPersegiPanjang")
    apl()
}
//keliling lingkaran
fun keLing () {
    println("==========Menghitung Keliling Lingkaran==========")
    println("Masukan ukuran jari jari = ")
    val jarijari = readln()!!.toInt()
    val phi = 3.14
    val keLing = 2 * phi * jarijari
    println("Keliling Lingkaran adalah : $keLing")
    apl()
}