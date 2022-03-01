package OOP
//membuat class dengan construction
//penambahan function go
class MotorC (var merk: String, var tipe: String, var tahun: Int){
    fun go() {
        println ("Vroom!")
    }
    fun speed (maxSpeed: Int) {
        println("Kecepatan Maximum : " + maxSpeed)
    }
}
