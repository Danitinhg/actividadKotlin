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
    var cierres1: Int = 0
    var cierres2: Int = 0
    var cierres3: Int = 0
    var abierto1: Boolean = false
    var abierto2: Boolean = false
    var abierto3: Boolean = false

    val listMensaje: MutableList<String> = mutableListOf()

    for (i in mensaje.toCharArray().indices) {
        val letra: Char = mensaje[i]
        if (letra == '(' || letra == '{' || letra == '[') {
            listMensaje.add(letra.toString())
        } else if (letra == ')' || letra == '}' || letra == ']') {
            listMensaje.add(letra.toString())
        }
    }

    
    
    if (cierres1 % 2 == 0 && cierres2 % 2 == 0 && cierres3 % 2 == 0) {
        var balanceada: Boolean = true
        println("$mensaje ¿esta balanceada? $balanceada")
    } else {
        var balanceada: Boolean = false
        println("$mensaje ¿esta balanceada? $balanceada")
    }

    println(listMensaje)
}