package domain.racing

import common.utils.NumberUtil
import domain.car.Car

class Racing(
    private val cars: List<Car>,
    private val laps: Int
) {

    private fun race(car: Car) {
        val randomNumber = NumberUtil.getRandomNumber(0, 9)

        if (randomNumber >= 4) {
            car.move()
        }

        car.displayCurrentPosition()
    }

    fun start() {
        repeat(laps) {
            println("${it + 1}회차")

            for (car in cars) {
                race(car)
            }

            print("\n")
        }
    }

    fun getWinnerNames(): String {
        val maxPosition = cars.maxOf { it.position }
        val winnerNames = cars.filter { it.position == maxPosition }.joinToString(separator = ", ") { it.name }
        return "최종 우승자: $winnerNames"
    }

}