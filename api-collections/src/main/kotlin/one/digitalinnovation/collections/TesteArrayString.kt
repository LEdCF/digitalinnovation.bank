package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Carla"
    nomes[1] = "Luiz"
    nomes[2] = "Eduardo"

    for (nome in nomes) {
        println(nome)
    }

    println("----------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("----------------------")
    val nomes2 = arrayOf("Carla", "Luiz", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}