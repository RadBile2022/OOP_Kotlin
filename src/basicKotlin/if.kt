package basicKotlin

fun main() {
    var nilaiA = 80
    var nilaiB = 79



    when {
        nilaiA >= 80 -> {
           when {
               nilaiB >= 80 -> {
                   println("lulus")
               }
               else -> {
                   println("Tidak Lulus")
               }
           }
        }
        else -> {
            println("Tidak Lulus")
        }
    }
//
//    when {
//        nilaiA <= 80 -> {
//            when {
//                nilaiB <= 80 -> {
//                    println("LULUS TOD")
//                }
//                else -> {
//                    "Tidak lulus"
//                }
//            }
//            println("ga lulus")
//
//        }
//        else -> {
//            println("Tidak lulus")
//        }
//    }
}