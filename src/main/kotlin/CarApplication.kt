import common.utils.StringUtil
import common.validation.RacingValidation
import domain.car.CarFactory
import domain.racing.Racing

fun main() {

    println("경주에 참여할 자동차를 쉼표로 분기해서 입력해 주세요.")
    val cars = readln()
    RacingValidation.isValidNamesOfCars(cars)

    println("경주가 진행될 회수를 입력해 주세요.")
    val laps = readln()
    RacingValidation.isValidLapsCounts(laps)

    val preparedCarList = CarFactory.preparingCars(StringUtil.splitter(cars, ","))

    val racing = Racing(preparedCarList, laps.toInt())
    racing.start()

    val result = racing.getWinnerNames()
    println(result)
}
