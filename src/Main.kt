fun main() {
    for (i in 1..100) {

        var num: String
        num = i.toString()

        if (i % 3 == 0) {
            num = "tri"
        }

        if (i % 5 == 0) {
            num = "qui"
        }

        if (i % 3 == 0 && i % 5 == 0) {
            num = "triqui"
        }
        println("$num")
    }
}