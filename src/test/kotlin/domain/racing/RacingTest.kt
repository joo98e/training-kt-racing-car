package domain.racing

import domain.car.Car
import domain.car.CarFactory
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class RacingTest {
    private var cars: List<Car>? = null
    private val laps = 5

    @BeforeEach
    fun initialize() {
        cars = CarFactory.createCars(
            listOf(
                "carA",
                "carB",
                "carC",
            )
        )
    }

    @DisplayName("start 콜백 호출 테스트")
    @Test
    fun startTest() {
        var tempNum = 0
        val racing = Racing(cars!!, laps)

        racing.start { tempNum++ }

        tempNum shouldBe laps
    }

    @DisplayName("getCars size 테스트")
    @Test
    fun getCars() {
        val racing = Racing(cars!!, laps)
        val carsList = racing.getCars()
        carsList shouldHaveSize cars!!.size
    }

    @Test
    fun getWinners() {
    }
}