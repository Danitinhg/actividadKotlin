fun main() {
    var anagrama: Boolean = false
    var contador: Int = 0

    println("Introduzca una palabra: ")
    val palabra1 = readln()
    println("Introduzca otra palabra: ")
    val palabra2 = readln()

    val listPalabra1: MutableList<String> = mutableListOf()
    val listPalabra2: MutableList<String> = mutableListOf()

    for (i in palabra1.toCharArray().indices) {
        val letra: Char = palabra1[i]
        listPalabra1.add(letra.toString())
    }

    for (i in palabra2.toCharArray().indices) {
        val letra: Char = palabra2[i]
        listPalabra2.add(letra.toString())
    }

    for (i in listPalabra1) {
        if (listPalabra2.contains(i)) {
            contador++
        }
    }

    if (contador == listPalabra1.size) {
        anagrama = true
    }

    if (palabra1 == palabra2) {
        anagrama = false
    }

    println("¿Las palabras $palabra1 y $palabra2 son un anagrama? = $anagrama")
}