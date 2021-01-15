package basic

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class FunctionBasicTest {

    @Test
    fun max() {
        val functionBasic = FunctionBasic()
        val max = functionBasic.max(1, 5)
        assertEquals(max, 5)
    }
}
