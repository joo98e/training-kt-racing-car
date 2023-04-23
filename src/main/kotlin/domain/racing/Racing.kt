package domain.racing

import common.utils.NumberUtil
import domain.car.Car

class Racing(
    private val cars: List<Car>, private val laps: Int
) {

    fun start() {
        println("경주가 시작됩니다.\n")
        repeat(laps) {
            println("${it + 1}회차")
            for (car in cars) {
                val randomNumber = NumberUtil.getRandomNumber(0, 9)

                if (randomNumber >= 4) {
                    car.move()
                }

                car.displayCurrentPosition()
            }
            print("\n")
        }
    }

    fun getWinnerNames(): String {
        val maxPosition = cars.maxOf { it.position }
        val winnerNames = cars.filter { it.position == maxPosition }.map { it.name }.joinToString(separator = ", ")
        return "최종 우승자: $winnerNames"
    }

}