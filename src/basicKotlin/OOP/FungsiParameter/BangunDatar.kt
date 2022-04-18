package basicKotlin.OOP.FungsiParameter

///classs make var kalo fungsi tidak make var

class BangunDatar(var valueA:Int, var valueB:Int) {

    fun hitungLuasPersegi (){
        var hitung = valueA*valueB
        println("Luas Persedi Adalah $hitung")
    }

    //dengan parameter
    fun hitungKeliling( sisi : Int){
        var hitung = sisi*sisi*sisi*sisi
        println("Keliling Persedi Adalah $hitung")
    }


}