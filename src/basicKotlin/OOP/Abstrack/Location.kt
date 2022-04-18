package basicKotlin.OOP.Abstrack

abstract class Location(val name:String){

    fun waktuBagian(){
       println("Waktu Indonesi Bagian Ujung")
   }

  open fun yelYel(){
      println("lalalala")
  }

}



class City(name: String) : Location(name){
    override fun yelYel() {
        println("DJAANNNNNNNNNNNNNNN")
    }
}

//class Country(name: String) : Location(name)