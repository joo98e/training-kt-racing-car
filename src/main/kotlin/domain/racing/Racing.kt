package domain.racing

import common.utils.NumberUtil
import domain.car.Car

class Racing(
    private val cars: List<Car>,
    private val laps: Int
) {
    private var lapCount = 0

    fun start(callback: (Int) -> Unit) {
        while (lapCount < laps) {
            cars.forEach { race(it) }
            callback(++this.lapCount)
        }
    }

    private fun race(car: Car) {
        val randomNumber = NumberUtil.getRandomNumber(0, 9)
        if (randomNumber >= 4) {
            car.move()
        }
    }

    fun getCars(): List<Car> {
        return cars
    }

    fun getWinners(): List<Car> {
        val maxPosition = cars.maxOf { it.position!! }
        return cars.filter { it.position == maxPosition }
    }
}