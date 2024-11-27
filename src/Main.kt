import kotlin.time.measureTime

fun main() {
    programa4(arrayOf("correr", "saltar", "correr", "saltar", "correr"), "_|_|_")
    programa4(arrayOf("correr", "correr", "correr", "saltar", "correr"), "_|_|_")
    programa4(arrayOf("correr", "correr", "saltar", "saltar", "correr"), "_|_|_")
    programa4(arrayOf("correr", "correr", "saltar", "saltar", "correr"), "_|_|_|_")
    programa4(arrayOf("correr", "saltar", "correr", "saltar"), "_|_|_")
    programa4(arrayOf("correr", "saltar", "correr", "saltar", "correr", "saltar", "correr"), "_|_|_")
    programa4(arrayOf("saltar", "saltar", "saltar", "saltar", "saltar"), "|||||")
    programa4(arrayOf("saltar", "saltar", "saltar", "saltar", "saltar"), "||_||")
}

fun programa4 (arrayAccion: Array<String>, pista: String) {

    var iguales: Boolean = false
    val listAccion: MutableList<String> = mutableListOf()
    val listPista: MutableList<String> = mutableListOf()


    for (i in arrayAccion) {
        if (i == "correr") {
            listAccion.add("_")
        } else {
            listAccion.add("|")
        }
    }

    for (i in pista.toCharArray().indices) {
        val letra: Char = pista[i]
        if (letra == '_') {
            listPista.add("_")
        } else {
            listPista.add("|")
        }
    }

    if (listAccion == listPista) {
        iguales = true
        println("$pista $iguales")
    } else {

    }

}

