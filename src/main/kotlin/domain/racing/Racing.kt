package domain.racing

import common.utils.NumberUtil
import domain.car.Car

class Racing(
    private val cars: List<Car>,
) {

    fun getCars(): List<Car> {
        return cars
    }

    private fun race(car: Car) {
        val randomNumber = NumberUtil.getRandomNumber(0, 9)
        if (randomNumber >= 4) {
            car.move()
        }
    }

    fun tryRace() {
        for (car in cars) {
            race(car)
        }
    }

    fun getWinners(): List<Car> {
        val maxPosition = cars.maxOf { it.position }
        return cars.filter { it.position == maxPosition }
    }

}