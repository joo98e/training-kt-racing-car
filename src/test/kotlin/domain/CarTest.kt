package domain

import domain.car.Car
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class CarTest {
    @Test
    fun sample() {
        //given
        val car = Car("name", 2)

        //whn
        val name = car.name

        //then
        name shouldBe "name"
    }
}