package basicKotlin

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.Month

fun main() {

    //when ekspresi untuk menentukan bulan
    val hari : DayOfWeek = LocalDate.now().dayOfWeek
    val bulan : Month = LocalDate.now().month

    val day = when (hari){
        DayOfWeek.MONDAY -> "Senin"
        DayOfWeek.TUESDAY -> "Selasa"
        DayOfWeek.WEDNESDAY -> "Rabu"
        DayOfWeek.THURSDAY -> "Kamis"
        DayOfWeek.FRIDAY -> "Jum'at"
        DayOfWeek.SATURDAY -> "Sabtu"
        DayOfWeek.SUNDAY -> "Minggu"
        else -> "Not a Day of Week"
    }

    val month = when (bulan){
        Month.JANUARY -> "Januari"
        Month.FEBRUARY -> "Februari"
        Month.MARCH -> "Maret"
        Month.APRIL -> "April"
        Month.MAY -> "Mei"
        Month.APRIL -> "Juni"
        Month.JUNE -> "Juni"
        Month.JULY -> "Juli"
        Month.AUGUST -> "Agustus"
        Month.SEPTEMBER -> "September"
        Month.OCTOBER -> "Oktober"
        Month.NOVEMBER -> "November"
        Month.DECEMBER -> "Desember"
        else -> "Not a Month of Year"
    }
    println (month)
    println(day)


//    var a = 9
//
//    when (a) {
//        9-> println("Baik")
//        10-> println("Sangat Baik")
//        8 -> println("Cukup")
//        else -> println("Silahkan coba kembali")
//    }
////when menggunakan ekspresi
//    a = 8
//    var b = 5
////when kondisi
//    val nilaiAkhir = when (b) {
//        5 -> println("Remedial")
//        6 -> println("Kurang Cukup")
//        7 -> println("Cukup")
//        8 -> println("Baik")
//        9 -> println("Sangat Baik")
//        10-> println("Amazin".toUpperCase())
//        else -> println("Silahkan coba lagi tahun depan")
//    }
////when menggunakan operator in && !in (range)
//    val c = 12
//    when (c) {
//        in 1..5 -> println("Nilai C diantara 1..5")
//        in 6..10-> println("Nilai c dianatara 6..10")
//        !in 11..15 -> println("Nilai C tidak ada diantara 11..15")
//        else -> println("tidak ada nilai c")
//    }
////when menggunakan grouping
//    val dayOfWeek = 10
//    when (dayOfWeek) {
//        1,2,3,4,5 -> println("weekday")
//        6,7 -> println("weekend")
//        else -> println("invalid input")
//    }
//
//
}