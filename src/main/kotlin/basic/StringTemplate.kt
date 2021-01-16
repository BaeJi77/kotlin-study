package basic

fun main(args: Array<String>) {
    val stringTemplate = StringTemplate()
    stringTemplate.customString("kotlin")
    stringTemplate.customStringComplex("World!!")
}


class StringTemplate {

    fun customString(str: String) = println("Hello, $str")

    fun customStringComplex(str: String) = println("Hello, ${str}")
}
