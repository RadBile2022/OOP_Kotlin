package basicKotlin.OOP.AbstrackPropertieFunc

abstract class Animal {

    abstract  val name:String
    abstract fun run():Unit
}

abstract class Person{
    abstract  val name:String
    abstract   fun suara ():Unit
}

class Man:Person(){
    override  val name:String = "Pa Nay"
    override  fun suara(){
        println("dadadadaedwqwdqwqqdwq")
    }
}


class Cat : Animal(){
    override val name:String="fernandes"
    override fun run(){
        println("da")
    }
}