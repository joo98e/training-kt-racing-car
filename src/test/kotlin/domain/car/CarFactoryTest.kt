package domain.car

import common.exception.ExpectedException
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class CarFactoryTest : BehaviorSpec({
    given("CarFactory") {
        `when`("이름이 주어지면") {
            then("List<String>만큼 Car 를 생성한다.") {
                CarFactory.createCars(
                    listOf(
                        "car1",
                        "car2",
                        "car3",
                        "car4",
                    )
                )
            }
        }
    }

    given("CarFactory - 2") {
        `when`("5자 이상의 Car 이름이 주어졌을 때") {
            then("예외를 발생 시킨다.") {
                val overLengthCar = "overLength"

                val expectedException = shouldThrow<ExpectedException> { Car(overLengthCar, 0) }
                expectedException.message shouldBe "[ERROR]: 차량의 이름은 5자 이하이어야 합니다."
            }
        }
    }
})