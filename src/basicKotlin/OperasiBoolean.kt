package basicKotlin

fun main() {
    val nilaiUjian = 80
    val nilaiAbsen = 70

    val NilaiAkhirUjian = nilaiUjian >= 75
    val NilaiAkhirAbsen = nilaiAbsen >= 80

    println(NilaiAkhirUjian && NilaiAkhirAbsen)
    println(NilaiAkhirUjian || NilaiAkhirAbsen) //jika salah 1 nilainya true maka nilainya true
    println(!NilaiAkhirUjian) //kebalikan nilai sebenarnya
    println(!NilaiAkhirAbsen) //kebalikan nilai sebenarnya
}