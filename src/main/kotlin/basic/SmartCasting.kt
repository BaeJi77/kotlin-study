package basic

fun main() {
    println(evalWithIf(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalWithWhen(Sum(Sum(Num(1), Num(2)), Num(4))))
}

fun evalWithIf(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return evalWithIf(e.right) + evalWithIf(e.left)
    }
    throw IllegalAccessException()
}

fun evalWithWhen(e: Expr): Int =
    when (e) {
        is Num ->
            e.value
        is Sum ->
            evalWithWhen(e.left) + evalWithWhen(e.right)
        else -> throw IllegalAccessException()
    }


class SmartCasting {
}

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
