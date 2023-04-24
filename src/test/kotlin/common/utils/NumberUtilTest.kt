package common.utils

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.booleans.shouldBeTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

class NumberUtilTest {

    @DisplayName("최대 값, 최소 값 포함 테스트")
    @Test
    fun randomNumberIsInside() {
        val minValue = 1
        val maxValue = 100

        val randomNumber = NumberUtil.getRandomNumber(minValue, maxValue)
        val isInside: Boolean = randomNumber in minValue..maxValue

        isInside.shouldBeTrue()
    }

    @DisplayName("최대 값과 최소 값이 잘못 들어오는 경우에 대한 예외 처리 [IllegalArgumentException] ")
    @Test
    fun willThrowIllegalArgumentException() {
        val minValue = 100
        val maxValue = 1

        shouldThrow<IllegalArgumentException> {
            NumberUtil.getRandomNumber(minValue, maxValue)
        }
    }
}