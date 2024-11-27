fun main() {
    programa3("{a + b [c] * (2x2)}}}}")
    programa3("{ [ a * ( c + d ) ] - 5 }")
    programa3("{ a * ( c + d ) ] - 5 }")
    programa3("{a^4 + (((ax4)}")
    programa3("{ ] a * ( c + d ) + ( 2 - 3 )[ - 5 }")
    programa3("{{{{{{(}}}}}}")
    programa3("(a")
    programa3("( a + b { 2 * 4 ) + 3 }")
}

fun programa3 (mensaje: String) {
    var balanceada: Boolean = false
    val listMensaje: MutableList<String> = mutableListOf()
    val listMensajeCopia: MutableList<String> = mutableListOf()

    for (i in mensaje.toCharArray().indices) {
        val letra: Char = mensaje[i]
        if (letra == '(' || letra == '{' || letra == '[') {
            listMensaje.add(letra.toString())
            listMensajeCopia.add(letra.toString())
        } else if (letra == ')' || letra == '}' || letra == ']') {
            listMensaje.add(letra.toString())
            listMensajeCopia.add(letra.toString())
        }
    }

    for (i in listMensaje) {
        when (i) {
            "(" -> {
                if (listMensajeCopia.last() == ")") {
                    listMensajeCopia.remove(i)
                    listMensajeCopia.remove(listMensajeCopia.last())
                }
            }

            "{" -> {
                if (listMensajeCopia.last() == "}") {
                    listMensajeCopia.remove(i)
                    listMensajeCopia.remove(listMensajeCopia.last())
                }
            }

            "[" -> {
                if (listMensajeCopia.last() == "]") {
                    listMensajeCopia.remove(i)
                    listMensajeCopia.remove(listMensajeCopia.last())
                }
            }
        }
    }

    if (listMensajeCopia.none()) {
        balanceada = true
    }

    println("$mensaje ¿está balanceada? $balanceada")
}















