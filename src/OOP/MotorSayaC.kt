package OOP

import OOP.MotorC

//============ Contoh constractor banyak data ============
fun main() {
    val motorSaya = MotorC ("Honda", "Vario 125", 2019)
    val motorTeman = MotorC ("Yamaha", "Nmax 155", 2020)

    println(motorSaya.merk)
    println(motorSaya.tipe)
    println(motorSaya.tahun)

    println(motorTeman.merk)
    println(motorTeman.tipe)
    println(motorTeman.tahun)

    motorSaya.go() //penambahan function go
    motorSaya.speed(120)
}

//============ Contoh constractor 1 data ============
// fun main(){
//     val motorSaya = MotorC ("Honda", "Vario", 2019)
//
//     println(motorSaya.merk)
//     println(motorSaya.tipe)
//     println(motorSaya.tahun)
// }