import org.junit.Assert.assertEquals
import org.junit.Test
import ru.netology.comissionBasedOnType
import ru.netology.transaction

class FunctionsForTestKtTest {
    @Test
    fun main () {
    }

    @Test
    fun comissionBasedOnType() {
        val expected = 112.5
        val result = comissionBasedOnType("VISA", 1500.0)

        assertEquals(expected.toInt(), result.toInt())
    }

    @Test
    fun transaction() {
        val expected = 112.5
        val result = transaction(80.0,1500.0,112.5)

        assertEquals(expected.toInt(), result.toInt())
    }
    @Test
    fun limitations () {
    }
}