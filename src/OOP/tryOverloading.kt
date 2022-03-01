package OOP

import OOP.Person

fun main (){
    val maryam = Person()
    maryam.firstName = "maryam"
    maryam.middleName = "Izzah"
    maryam.lastName = "Azifah"

    maryam.sayHello("Faisal")
    maryam.sayHello("afni", "Indira")
}
