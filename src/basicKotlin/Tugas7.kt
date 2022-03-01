package basicKotlin
fun main() {

    //input nama
    repeat(20){print("=")}
    println("")
    println("Input Nama Mahasiswa : ")
    val namaMhs = readln()
    //input jurusan
    println("Jurusan : ")
    val jurusan = readln()
    repeat(20){print("=")}
    println("")
    println("Perhitungan Nilai : ")
    repeat(20){print("=")}
    println("")
    println("Dinyatakan Lulus")
    println("Apabila Rata - rata nilai lebih dari 70")
    repeat(20){print("=")}
    println("")
    //input nilai
    println("Nilai Matkul A : ")
    val nilaiA = readln()!!.toInt()
    println("Nilai Matkul B : ")
    val nilaiB = readln()!!.toInt()
    println("Nilai Matkul C : ")
    val nilaiC = readln()!!.toInt()
    repeat(20){print("=")}
    println("")
    //Nilai Akhir
    val nilaiAkhir = nilaiA+nilaiB+nilaiC/3
    println ("Nilai rata - rata : $nilaiAkhir")
    repeat(20){print("=")}
    println("")
    println("Hasil : ")
    if (nilaiAkhir > 70){
        println ("Lulus")
    } else {
        println ("Maaf anda tidak lulus")
    }
}