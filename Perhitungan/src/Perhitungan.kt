class Perhitungan(val angka1:Double, val angka2:Double){
    var hasil = 0.0

    fun Penjumlahan(){
        hasil = angka1 + angka2
        println("Hasil = " + hasil)
    }

    fun Pengurangan(){
        hasil = angka1 - angka2
        println("Hasil = " + hasil)
    }

    fun Pembagian() {
        try {
            hasil = angka1 / angka2
            println("Hasil = " + hasil)
        } catch (err: Exception) {
            println(err.message)
        }
    }

    fun Perkalian(){
        try {
            hasil = angka1 * angka2
            println("Hasil = " + hasil)
        }catch (err: Exception){
            println(err.message)
        }
    }
}

fun main(args: Array<String>) {
do {
    println()
    println("Pilih Operasi Perhitungan:")
    println("1. Penjumlahan")
    println("2. Pengurangan")
    println("3. Pembagian")
    println("4. Perkalian")
    println("5. Keluar")
    println()

    print("Nomor Operasi : ")
    val op = readLine()!!.toInt()

    if (op < 5) {
        print("Masukkan angka pertama : ")
        val n1 = readLine()!!.toDouble()
        print("Masukkan angka kedua   : ")
        val n2 = readLine()!!.toDouble()
        println()

        val hitung = Perhitungan(n1, n2)
        when (op) {
            1 -> hitung.Penjumlahan()
            2 -> hitung.Pengurangan()
            3 -> hitung.Pembagian()
            4 -> hitung.Perkalian()
        }
    }else if (op == 5){
        println()
        println("Terimakasih ^_^")
        System.exit(0)
    }
    else{
        println()
        println("Maaf Nomer Operasi tidak terdaftar...")
    }
}
while (true)
}