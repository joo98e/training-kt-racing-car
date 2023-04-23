import common.utils.StringUtil
import domain.racing.RacingValidation
import domain.car.CarFactory
import domain.racing.Racing

fun main() {

    println("경주에 참여할 자동차를 쉼표로 분기해서 입력해 주세요.")
    val inputCars = readln()
    RacingValidation.isValidateNamesOfCars(inputCars)

    println("경주가 진행될 회수를 입력해 주세요.")
    val inputLaps = readln()
    RacingValidation.isValidateLapsCount(inputLaps)

    val cars = CarFactory.createCars(StringUtil.splitter(inputCars, ","))

    val racing = Racing(cars, inputLaps.toInt())
    racing.start()

    val result = racing.getWinnerNames()
    println(result)
}
