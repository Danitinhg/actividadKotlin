fun main() {

    
}

fun programa3 (mensaje: String) {
    var cierres: Int = 0

    val listMensaje: MutableList<String> = mutableListOf()

    for (i in mensaje.toCharArray().indices) {
        val letra: Char = mensaje[i]
        listMensaje.add(letra.toString())
    }
}