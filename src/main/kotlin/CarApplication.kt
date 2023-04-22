import common.utils.StringUtil
import common.validation.Validation
import domain.car.CarFactory
import domain.racing.Racing

fun main() {
    println("자동차 어플리케이션입니다.\n")
    println("경주에 참여할 자동차를 쉼표로 분기해서 입력해 주세요.")
    val cars = readln()

    println("경주가 진행될 회수를 입력해 주세요.")
    val laps = readln().toDoubleOrNull()

    Validation.isEmpty(cars, "경주할 자동차가 없습니다.")
    Validation.isNaN(laps!!, "경주할 회수가 부족합니다.")

    val racing = Racing()
    val racingCars = CarFactory.prepareCarList(StringUtil.splitter(cars, ","));
    val result = racing.start(racingCars, laps)
}
