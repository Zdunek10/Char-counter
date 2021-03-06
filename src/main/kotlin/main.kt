import java.io.File
import java.io.IOException

fun main(){

    // File name as and input where file should be located in TextDir directory in txt format)
    val file:String = readLine().toString()
    val read = TextReader()

    try {
        read.returnNumberOfChars("TextDir/" + file)
        read.readFile("TextDir/"  + file)
    }catch (e: IOException){
        print("Missing file in 'TextDir' directory, check it.")
    }
}

class TextReader {
    var count = 0

    //reading and printing txt file
    fun readFile(fileName: String){
        File(fileName).forEachLine {
            print(it + "\n")
        }
    }

    // returning the number of chars in each line
    fun returnNumberOfChars(fileName: String){
        File(fileName).forEachLine {
            count = countChars(it)
        }
    }

    var line = 1
    private fun countChars(fileName: String): Int{
        val count = fileName.count {fileName.contains(it)}
        print("Line: " + line + "\t Number of chars: ")
        println(count)
        line ++
        return count
    }
}