package domain.racing

import common.exception.ExpectedException
import common.validation.Validation

object RacingValidation {

    fun isValidateNamesOfCars(str: String) {
        if (str.isEmpty()) {
            throw ExpectedException("경주할 자동차 이름을 입력해 주세요.")
        }
    }

    fun isValidateLapsCount(str: String) {
        if (str.isEmpty()) {
            throw ExpectedException("회차를 입력해 주세요.")
        }

        if (!Validation.isNumeric(str)) {
            throw ExpectedException("회차는 숫자 형식이어야 합니다.")
        }

        if (Validation.isNegativeInteger(str)) {
            throw ExpectedException("회차는 양수여야 합니다.")
        }
    }
}