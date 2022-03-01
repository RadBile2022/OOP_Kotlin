package OOP

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello (name: String){
        println("Hello $name, My name is $firstName")
    }
    fun sayHello (paramFirstName : String, paramLastname: String){
        println("Hello $paramFirstName $paramLastname, My name is $firstName")
    }
}