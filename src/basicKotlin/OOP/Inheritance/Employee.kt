package basicKotlin.OOP.Inheritance

open class Employee(val name:String) {
    fun sayHello(name:String){
        println("Hello $name, My name is ${this.name}")
    }
}

open class BangunDatar(var valueA:Int, var valueB:Int) {

    fun hitungLuasPersegi (){
        var hitung = valueA*valueB
        println("Luas Persegi Adalah $hitung")
    }

    //dengan parameter
    fun hitungKeliling( sisi : Int){
        var hitung = sisi*sisi*sisi*sisi
        println("Keliling Persegi Adalah $hitung")
    }


}

class  hitungLP(valueA: Int,valueB: Int,var valueC: Int) : BangunDatar(valueA,valueB)
class Manager (nam :String) : Employee(nam){

}
