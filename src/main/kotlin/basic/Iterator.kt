package basic

import java.util.*

fun main() {
    val map = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        map[c] = c.toInt().toString()
    }

    for ((c, string) in map) {
        println("$c, $string")
    }

    val list = arrayListOf(1, 2, 3, 4, 5)
    for ((index, value) in list.withIndex()) {
        println("$index, $value")
    }

    println("char: a -> ${recognize('a')}")
    println("char: 1 -> ${recognize('1')}")
    println("char: ! -> ${recognize('!')}")
}

fun recognize(n: Char) = when (n) {
    in '0'..'9' -> "digit"
    in 'a'..'z', in 'A'..'Z' -> "letter"
    else -> "no"
}

class Iterator {
}
