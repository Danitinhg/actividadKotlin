fun main() {
    var anagrama: Boolean = true

    println("Introduzca una palabra: ")
    val palabra1 = readln()
    println("Introduzca otra palabra: ")
    val palabra2 = readln()

    if (palabra1 == palabra2) {
        anagrama = false
    }

    val ayPalabra1: MutableList<Char> = mutableListOf()
    val ayPalabra2: MutableList<Char> = mutableListOf()

    for (i in palabra1.toCharArray().indices) {
        val letra: Char = palabra1[i]
        ayPalabra1.add(letra)
        println(ayPalabra1)
    }

    for (i in palabra2.toCharArray().indices) {
        val letra: Char = palabra2[i]
        ayPalabra2.add(letra)
        println(ayPalabra2)
    }

    




    println("¿Las palabras $palabra1 y $palabra2 son un anagrama? = $anagrama")

}