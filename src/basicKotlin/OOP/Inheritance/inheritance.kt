package basicKotlin.OOP.Inheritance

fun main() {
    val fernandes = Manager("Fernandes")
    println(fernandes.name)
    fernandes.sayHello("Toska")

    val tores = Manager ("Tores")
    println(tores.name)
    tores.sayHello("Toska")

    val hitung = BangunDatar(2,4)
    hitung.hitungLuasPersegi()
    hitung.hitungKeliling(2)

}
