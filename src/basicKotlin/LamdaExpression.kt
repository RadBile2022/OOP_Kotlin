package basicKotlin

fun main() {
    //Lamda = fungsi tanpa nama dan bisa dideklarasikan valuenya
    val addLamda : (Int, Int) -> Int //Mengisi parameter sekaligus mengembalikan valuenya
    addLamda = {a:Int, b:Int -> a*b} //Value dari parameter setelah return type di isi ekspresi kode program
    val hitungLamda = addLamda (6,3) //lamda expression menggunakan 2 parameter
    println("hitung Lamda menggunakan 2 parameter : " + hitungLamda)

    //Lamda dengan 1 parameter
    val addLamda1 : (Int) -> Int
    addLamda1 = {it*2}
    val hitungLamda1 = addLamda1 (10)
    println("Hitung Lamda menggunakan 1 parameter dan dengan keyword it : " +hitungLamda1)
}
