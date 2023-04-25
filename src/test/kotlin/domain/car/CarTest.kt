package domain.car

import common.exception.ExpectedException
import domain.car.Car
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CarTest {

    @DisplayName("차량의 이름은 5자 이하이어야 한다. 그 이상일 경우 예외를 던진다.")
    @Test
    fun carInitTest() {
        val overLengthName = "OVER_LENGTH"
        val shouldThrow = shouldThrow<ExpectedException> {
            Car(overLengthName, 0)
        }

        shouldThrow.message shouldBe ("[ERROR]: 차량의 이름은 5자 이하이어야 합니다.")
    }
}