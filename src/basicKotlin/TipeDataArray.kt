package basicKotlin

import java.util.Arrays

fun main() {
    var name = arrayOf("Indra", "Yusup", "Rizki", "Andhy","Agus")
    var nilai = intArrayOf(90,80,70,60,50,40,80,100,30)
    var ipk = doubleArrayOf(3.2,2.75,3.5,2.82)

    val max = nilai.maxOrNull()
    val min = nilai.minOrNull()
    var rata2 = nilai.average()
    var pembulatan = String.format("%,.2f",rata2)

    //Mencari nilai Max dan Min
    println("Nilai max dari siswa adalah = ${nilai.maxOrNull()}")
    println("nilai min dari siswa adalah = $min")
    println(ipk.maxOrNull())
    println(ipk.minOrNull())

    //Mencari nilai rata - rata
    println("Nilai rata-rata siswa adalah = $rata2")
    println("Nilai pembulatan dari seluruh siswa adalah = $pembulatan")

    //Memanggil kumpulan data di Array
    //Menggunakan perulangan for
    for (array in name){
        println(array)
    }

//    //Menggunakan library dari java
//    println(name.joinToString())
//    println(nilai.joinToString())

        println(Arrays.toString(name)) //import java.util.Arrays
        println(Arrays.toString(nilai)) //import java.util.Arrays


//    //Merubah data di index array
//    //namavariable.set(index, "String")
//    name.set(1, "Sholihin Sholeh")
//
//    //size > panjang array (jumlah data yang terinput)
//    println (name.size)
//
//    //get > mendapatkan data index
       println(name.get(1))
//
//    println(name[3])
//    println(nilai[2])
//
//    //Memanggil data index setelah di set(dirubah)
//    println(name[1])
//
//    //Array Nullable
//    //Masih bagian dari NULL POINTER EXCEPTION
//    var matakuliah : Array<String?> = arrayOfNulls(size = 3)
//    matakuliah.set(0,null)
//    matakuliah.set(1, null)
//    matakuliah.set(2, "Pemograman Web")
//
//    println(matakuliah[0])
//    println(matakuliah[1])
//    println(matakuliah[2])

//    println("Nama Mahasiswa : ${nama.get(0)} | Mata Kuliah : ${mk.get(0)} | Nilai : ${nilai.get(0)} | IPK : ${ipk.get(0)}")
//    println("Nama Mahasiswa : ${nama.get(2)} | Mata Kuliah : ${mk.get(2)} | Nilai : ${nilai.get(2)} | IPK : ${ipk.get(2)}")
//    println("Nama Mahasiswa : ${nama.get(3)} | Mata Kuliah : ${mk.get(3)} | Nilai : ${nilai.get(3)} | IPK : ${ipk.get(3)}")
//    println("Nama Mahasiswa : ${nama.get(5)} | Mata Kuliah : ${mk.get(5)} | Nilai : ${nilai.get(5)} | IPK : ${ipk.get(5)}")
//    println("Nama Mahasiswa : ${nama.get(7)} | Mata Kuliah : ${mk.get(7)} | Nilai : ${nilai.get(7)} | IPK : ${ipk.get(7)}")

}