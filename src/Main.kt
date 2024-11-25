fun main() {
    programa3("{a + b [c] * (2x2)}}}}")
    programa3("{ [ a * ( c + d ) ] - 5 }")
    programa3("{ a * ( c + d ) ] - 5 }")
    programa3("{a^4 + (((ax4)}")
    programa3("{ ] a * ( c + d ) + ( 2 - 3 )[ - 5 }")
    programa3("{{{{{{(}}}}}}")
    programa3("(a")
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
        listMensaje.add(letra.toString())
    }

    for (i in listMensaje) {
        if (i == "(") {
            cierres1++
            abierto1 = true
        }
    }

    for (i in listMensaje) {
        if (i == ")") {
            cierres1++
            abierto1 = false
        }
    }

    for (i in listMensaje) {
        if (i == "{") {
            cierres2++
            abierto2 = true
        }
    }

    for (i in listMensaje) {
        if (i == "}") {
            cierres2++
            abierto2 = false
        }
    }

    for (i in listMensaje) {
        if (i == "[") {
            cierres3++
            abierto3 = true
        }
    }

    for (i in listMensaje) {
        if (i == "]") {
            abierto3 = false
        }
    }
    
    if (cierres1 % 2 == 0 && cierres2 % 2 == 0 && cierres3 % 2 == 0) {
        var balanceada: Boolean = true
        println("$mensaje ¿esta balanceada? $balanceada")
    } else {
        var balanceada: Boolean = false
        println("$mensaje ¿esta balanceada? $balanceada")
    }
}