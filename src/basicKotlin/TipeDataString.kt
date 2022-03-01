package basicKotlin

fun main() {
    // String menggunakan tanda petik 2 ""
    val firstName : String = "Mohamad"
    val middleName : String = "Yusup"
    val lastName : String = "Permana "

    //String menggunakan tanda petik 3 """
    var address : String = """
        Jalan aja dulu
        No. 19
        Kayuringin
        Bekasi Selatan
    """.trimIndent()

    println ("Halo, nama saya $firstName$middleName$lastName. dan alamat saya $address")

    //String Template
    //Memakasi $ ... untuk memanggil variable

    println ("""
        > Nama Pertama = $firstName
        > Nama Kedua = $middleName
        > Nama Ketiga = $lastName
    """.trimMargin ("|")) //default trimMargin use pipeChar "|"
    //margin prefix "|" tidak boleh kosong. bisa juga memakai simbol seperti @ / | / > / < dengan catatan ketik 2 kali di deklarasi

    //String Template menggunakan ${}
    val data = 1
    println ("Halo $middleName, selamat kamu juara ${data}st")

    //Menghitung jumlah karakter dalam 1 kalimat
    println("Jumlah karakter di teks firstname sebanyak ${firstName.length} karakter")



}