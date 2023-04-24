import common.utils.StringUtil
import domain.racing.RacingValidation
import domain.car.CarFactory
import domain.racing.Racing
import view.InputView
import view.OutputView

fun main() {
    val inputCarNames = InputView.inputCarNames()
    RacingValidation.isValidateNamesOfCars(inputCarNames)

    val inputLaps = InputView.inputLaps()
    RacingValidation.isValidateLapsCount(inputLaps)

    val cars = CarFactory.createCars(StringUtil.splitter(inputCarNames, ","))
    val racing = Racing(cars)

    repeat(inputLaps.toInt()) {
        racing.tryRace()
        OutputView.printForScoreDuringMatch(it + 1, racing.getCars())
    }

    val result = racing.getWinners()
    OutputView.printForScoreEndOfMatch(result)
}
