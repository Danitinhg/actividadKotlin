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

    var abierto1: Boolean = false
    var abierto2: Boolean = false
    var abierto3: Boolean = false

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
        if (i == "(") {
            val a: String = listMensaje.last()

            if (a == ")") {
                listMensajeCopia.remove(i)
                listMensajeCopia.remove(a)
            }
        }

        if (i == "{") {
            val a: String = listMensaje.last()

            if (a == "}") {
                listMensajeCopia.remove(i)
                listMensajeCopia.remove(a)
            }
        }

        if (i == "[") {
            val a: String = listMensaje.last()

            if (a == "]") {
                listMensajeCopia.remove(i)
                listMensajeCopia.remove(a)
            }
        }
    }
    
    println(listMensaje)
}















