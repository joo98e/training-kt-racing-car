package view

import domain.car.Car

object OutputView {
    private fun convertCarPositionToDash(position: Int): String {
        return "-".repeat(position)
    }

    fun printScoreDuringMatch(labCount: Int, cars: List<Car>) {
        println("${labCount}회차")
        cars.map { println("${it.name}: ${convertCarPositionToDash(it.position!!)}") }
        print("\n")
    }

    fun printScoreEndOfMatch(winnerCars: List<Car>) {
        val delimiter = ", "
        println("최종 우승자: ${winnerCars.joinToString(separator = delimiter) { it.name }}")
    }
}