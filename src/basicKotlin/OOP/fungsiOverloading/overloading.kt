package basicKotlin.OOP.fungsiOverloading

/*
Function overloading atau method overloading adalah kemampuan untuk membuat beberapa fungsi dengan nama yang sama dengan implementasi yang berbeda
Untuk membuat function overloading, kita wajib menggunakan parameter yang berbeda
Bisa menggunakan tipe parameter yang berbeda atau jumlah parameter yang berbeda
 */

fun main() {

    var person1 = Person()


    person1.sayHello("Toska")
    person1.sayHello("Toska","Caprio")
}