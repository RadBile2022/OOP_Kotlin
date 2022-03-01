package basicKotlin

import java.util.*

fun main() {
    //nomor 1 (BUAT TIPE DATA ARRAY MASING2 DATA YANG ADA DI TABEL)
    var nama = arrayOf("Joko", "Budi", "Ronald", "Cintia", "Agustian", "Andhy", "Rizki", "Yusuf", "Fanny", "Susilo")
    var mk = arrayOf("Mobile Prog", "IT Software", "Mobile Prog", "Mobile Prog", "IT Software", "Mobile Prog", "IT Software", "Mobile Prog", "IT Software", "IT Software")
    var nilai = intArrayOf(60, 70, 80, 90, 75, 85, 75, 65, 100, 70)
    var ipk = doubleArrayOf(3.25,2.78,3.24,3.45,2.98,3.00,3.35,2.78,3.45,2.90)
    val MP = arrayOf(
        "Joko","Mobile Prog",60,3.25,
        "Ronald","Mobile Prog",80,3.24,
        "Cintia","Mobile Prog",90,3.45,
        "Andhy","Mobile Prog",85,3.00,
        "Yusuf","Mobile Prog",65,2.78
    )
    val IS = arrayOf(
        "Budi","IT Software",70,2.78,
        "Agustian","IT Software",75,2.98,
        "Rizki","IT Software",75,3.35,
        "Fanny","IT Software",100,3.45,
        "Susilo","IT Software",70,2.90
    )

    val max = nilai.maxOrNull()
    val min = nilai.minOrNull()
    var rata2 = nilai.average()
    var pembulatan = String.format("%,.2f",rata2)

    //nomor 2 (PISAHKAN MASING2 ISI DATA YANG BERBEDA (BERDASARKAN MATA KULIAH)
    println(Arrays.toString(MP))
    println(Arrays.toString(IS))

    //nomor 3 (GANTI DATA INDEX KE 3 DI NAMA MAHASISWA DENGAN MATA  KULIAH MOBILE PROGRAMMING DENGAN NAMA “DIGA”)
    nama.set(3,"Diga")
    println (nama.get(3))

    //nomor 4 (GANTI DATA INDEX KE 4 DI NAMA MAHASISWA DENGAN MATA  KULIAH IT SOFTWARE DENGAN NAMA “SHOLIHIN”)
    nama.set(4, "Solihin")
    println (nama.get(4))

    //nomor 5 Mencari Nilai MAX
    println("Nilai MAX dari Mahasiswa adalah = $max")

    //nomor 6 Mencari Nilai MIN
    println("Nilai MIN dari Mahasiswa adalah = $min")

    //nomor 7 Mencari nilai Rata2 Mahasiswa (Pembulatan)
    println("Nilai Rata Mahasiswa adalah = $pembulatan")
}