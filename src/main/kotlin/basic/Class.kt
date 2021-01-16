package basic

fun main() {
    val clazz = Class("hello", 5)
    println(clazz.name)
    println(clazz.number)
    println(clazz.getTotalString)
}

class Class(
    val name: String,
    val number: Long
) {

    val getTotalString: String
    get() {
        return name + number
    }

}
