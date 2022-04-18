package basicKotlin.OOP.Interface

interface Hewan {

    val name : String
     fun suara()
}

class Kucing(override val name:String,var umur:Int): Hewan{

    override fun suara() {
       "ekekekekekekekkee"
    }

}