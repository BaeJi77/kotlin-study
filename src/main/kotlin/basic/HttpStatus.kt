package basic

fun main() {
    val failStatus = HttpStatus.FAIL
    println(failStatus)
    println(failStatus.statusCode)

    println(getStatusCode(failStatus))
}

fun getStatusCode(status: HttpStatus): Long {
    val statusCode: Long
    when (status) {
        HttpStatus.OK -> statusCode = HttpStatus.OK.statusCode
        HttpStatus.FAIL -> statusCode = HttpStatus.FAIL.statusCode
        HttpStatus.TOO_MANY_REQUEST -> statusCode = HttpStatus.TOO_MANY_REQUEST.statusCode
    }

    return statusCode
}


enum class HttpStatus(val statusCode: Long) {
    OK(200), FAIL(400), TOO_MANY_REQUEST(429);
}
