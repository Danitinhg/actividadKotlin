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

fun programa4 (array: Array<String>, pista: String) {

    println(array)
    println(pista)
}