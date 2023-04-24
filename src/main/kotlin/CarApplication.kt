import common.utils.StringUtil
import domain.racing.RacingValidation
import domain.car.CarFactory
import domain.racing.Racing
import view.InputView

fun main() {
    val inputCarNames = InputView.inputCarNames()
    RacingValidation.isValidateNamesOfCars(inputCarNames)

    println("경주가 진행될 회수를 입력해 주세요.")
    val inputLaps = readln()
    RacingValidation.isValidateLapsCount(inputLaps)

    val cars = CarFactory.createCars(StringUtil.splitter(inputCarNames, ","))

    val racing = Racing(cars, inputLaps.toInt())
    racing.start()

    val result = racing.getWinnerNames()
    println(result)
}
