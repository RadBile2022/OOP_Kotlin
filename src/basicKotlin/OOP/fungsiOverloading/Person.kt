package basicKotlin.OOP.fungsiOverloading

class Person {

    var firstName : String = "Fernandes"
    var middleName: String? = null
    var lastName : String = ""

    fun sayHello(name:String){
        println("Hello $name my name is $firstName" )
    }

    fun sayHello(paramFirstname:String, paramLastname:String){
        println("Hello $paramFirstname $paramLastname, My Name Is $firstName")
    }
}

