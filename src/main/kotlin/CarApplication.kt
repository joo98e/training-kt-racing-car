import common.utils.StringUtil
import domain.car.CarFactory
import domain.racing.Racing
import view.InputValidation
import view.InputView
import view.OutputView

fun main() {
    val inputCarNames = InputView.inputCarNames()
    InputValidation.isValidateNamesOfCars(inputCarNames)

    val inputLaps = InputView.inputLaps()
    InputValidation.isValidateLapsCount(inputLaps)

    val cars = CarFactory.createCars(StringUtil.splitter(inputCarNames, ","))
    val racing = Racing(cars, inputLaps.toInt())

    racing.start {
        OutputView.printScoreDuringMatch(it, racing.getCars())
    }

    val result = racing.getWinners()
    OutputView.printScoreEndOfMatch(result)
}
