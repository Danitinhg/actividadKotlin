fun main() {
    menu()
}

val arrayCont: Array<Contacto> = arrayOf()

fun menu () {

    println("1.- Añadir un contacto")
    println("2.- Listar contactos")
    println("3.- Buscar contacto por nombre")
    println("4.- Existe contacto")
    println("5.- Eliminar contacto")
    println("6.- Contactos disponibles")
    println("7.- Agenda llena")
    println("8.- Salir")
    println("¿Que acción desea realizar?")

    val opcion = readln().toInt()

    when (opcion) {
        1 -> {
            op1()
        }

        2 -> {
            op2()
        }

        3 -> {
            println("Indique el nombre del contacto que quiere mostrar su numero")
            val busca3 = readln()

            op3(busca3)
        }

        4 -> {
            println("Indique el nombre del contacto que quiere buscar")
            val busca4 = readln()
            op4(busca4)
        }

        5 -> {
            println("Indique el nombre del contacto que quiere eliminar")
            val busca5 = readln()
            op5(busca5)
        }

        6 -> {
            op6()
        }

        7 -> {
            op7()
        }

        8 -> {
            println("Saliendo del programa")
        }
    }


}

fun op1 () {
    println("Indique el nombre del nuevo contacto")
    val nom = readln()
    println("Indique el numero del nuevo contacto ")
    val num = readln()

    val con = Contacto(nom, num)

    if (arrayCont.size >= 3) {
        println("No se puede añadir un nuevo contacto porque la agenda esta llena")
        menu()
    }

    for (i in arrayCont) {
        if (arrayCont[i].nombre == nom) {
            println("Este contacto ya existe")
            menu()
        }
    }

    for (i in arrayCont) {
        if (arrayCont[i].nombre != "eliminado") {
            arrayCont[i] = con

            println("Contacto añadido correctamente")
            menu()
        }
    }

}



fun op2 () {

    if (arrayCont.isEmpty()) {
        println("La agenda esta vacia, no hay contactos que mostrar")
        menu()
    } else {
        for (i in arrayCont) {
            if (arrayCont[i].nombre != "eliminado") {
                val nomArr = arrayCont[i].nombre
                val numArr = arrayCont[i].numero

                println("Nombre: $nomArr Telefono: $numArr")
                menu()
            }
        }
    }
}

fun op3 (nom: String) {
    for (i in arrayCont) {
        if (arrayCont[i].nombre == nom) {
            val numeroNom = arrayCont[i].numero
            println("Su numero es $numeroNom")
            menu()
        }
    }
}

fun op4 (nom: String) {
    for (i in arrayCont) {
        if (arrayCont[i].nombre == nom) {
            println("Este contacto existe")
            menu()
        } else {
            println("Este contacto no existe")
            menu()
        }
    }
}

fun op5 (nom: String) {
    for (i in arrayCont) {
        if (arrayCont[i].nombre == nom) {
            arrayCont[i].nombre = "eliminado"
            arrayCont[i].nombre = "eliminado"
            println("Contacto eliminado")
            menu()
        } else {
            println("Este contacto no existe")
            menu()
        }
    }
}

fun op6 () {
    var contador: Int = 0

    for (i in arrayCont) {
        if (arrayCont[i].nombre == "eliminado") {
            contador++
        }
    }

    println("La agenda tiene $contador huecos libres")
    menu()

}

fun op7 () {
    var contador: Int = 0

    for (i in arrayCont) {
        if (arrayCont[i].nombre != "eliminado") {
            contador++
        }
    }

    if (contador == 0) {
        println("La agenda esta llena")
        menu()
    } else {
        println("Aun se pueden añadir contactos")
        menu()
    }
}

private operator fun Any.get(index: Contacto): Contacto {
    TODO("Not yet implemented")
}

private operator fun <T> Array<T>.set(i: T, value: T) {

}