import java.io.FileWriter

fun main(args: Array<String>) {
    print("Masukkan teks : ")
    val input = readLine()!!
    ketik(input)

    println("Teks '$input' telah tersimpan di src/text.txt")
}

fun ketik(str: String){
    try {
        var fo = FileWriter("src/test.txt", true)
        fo.write(str)
        fo.close()
    } catch (err: Exception){
        println(err.message)
    }
}