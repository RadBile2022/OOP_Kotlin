package basicKotlin

fun main() {
    //Tugas nomor 1
    val nilaiRekrut = 100
    println("Tugas Nomor 1")
    when (nilaiRekrut){
        in 1..90 -> println("tidak lulus pelatihan di BBPLK Bekasi ")
        else -> println("Lulus ikut pelatihan di BBPLK Bekasi")
    }

    //Tugas nomor 2
    val nama = "Agung"
    val nilaiAgung = 80

    println("Tugas Nomor 2")
    when (nilaiAgung){
        in 80..100-> println("Nilai $nama mencukupi")
        in 70..79-> println("Nilai $nama Nyaris Remedial")
        in 60..69 -> println("Nilai $nama Kamu REMEDIAL")
        in 0..59-> println ("Dimohon saudara $nama Belajar dengan lebih giat lagi")
        else -> println("Nilai tidak valid")
    }

    //Tugas nomor 3

    val kodeBaju = 2
    val ukuranBaju = 'M'

    println("Tugas Nomor 3")

    when (kodeBaju) {
       1 -> {
           println("Merk Baju : IMP")
           when(ukuranBaju){
               'S' -> println("Ukuran $ukuranBaju , harga 200.000")
               'M' -> println("Ukuran $ukuranBaju , harga 220.000")
               else -> println ("Ukuran $ukuranBaju, harga 250.000")
           }
       }
        2 -> {
            println("Merk Baju : Prada")
            when(ukuranBaju){
                'S' -> println("Ukuran $ukuranBaju , harga 150.000")
                'M' -> println("Ukuran $ukuranBaju , harga 160.000")
                else -> println ("Ukuran $ukuranBaju, harga 170.000")
            }
        }
        3 -> {
            println("Merk Baju : Gucci")
            when(ukuranBaju){
                'S' -> println("Ukuran $ukuranBaju , harga 200.000")
                'M' -> println("Ukuran $ukuranBaju , harga 300.000")
                else -> println ("Ukuran $ukuranBaju, harga 400.000")
            }
        }
        4 -> {
            println("Merk Baju : Louis Vitton")
            when(ukuranBaju){
                'S' -> println("Ukuran $ukuranBaju , harga 300.000")
                'M' -> println("Ukuran $ukuranBaju , harga 400.000")
                else -> println ("Ukuran $ukuranBaju, harga 500.000")
            }
        }
        5 -> {
            println("Merk Baju : Kick Denim")
            when(ukuranBaju){
                'S' -> println("Ukuran $ukuranBaju , harga 100.000")
                'M' -> println("Ukuran $ukuranBaju , harga 150.000")
                else -> println ("Ukuran $ukuranBaju, harga 200.000")
            }
        }
        else -> println("Salah Input Kode")
    }
}
