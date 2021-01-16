package basic

fun main() {
    val failStatus = HttpStatus.FAIL
    println(failStatus)
    println(failStatus.statusCode)

    println(getStatusCode(failStatus))
}

fun getStatusCode(status: HttpStatus): Long {
    return when (status) {
        HttpStatus.OK -> HttpStatus.OK.statusCode
        HttpStatus.FAIL -> HttpStatus.FAIL.statusCode
        HttpStatus.TOO_MANY_REQUEST -> HttpStatus.TOO_MANY_REQUEST.statusCode
    }
}


enum class HttpStatus(val statusCode: Long) {
    OK(200), FAIL(400), TOO_MANY_REQUEST(429);
}
