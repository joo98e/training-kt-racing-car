package domain.car

object CarFactory {

    private fun create(carName: String): Car {
        return Car(carName)
    }

    fun createCars(carNames: List<String>): List<Car> {
        return carNames.map { create(it) }
    }

}