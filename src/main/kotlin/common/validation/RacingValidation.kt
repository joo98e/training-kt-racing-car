package common.validation

import common.exception.ExpectedException

object RacingValidation {

    fun isValidNamesOfCars(str: String) {
        if (Validation.isEmpty(str)) {
            throw ExpectedException("경주할 자동차가 없습니다.")
        }
    }

    fun isValidLapsCounts(str: String) {
        if (Validation.isEmpty(str)) {
            throw ExpectedException("회차를 입력해 주세요.")
        }

        if (!Validation.isNumeric(str)) {
            throw ExpectedException("회차는 숫자이어야 합니다.")
        }

        if (Validation.isNegativeInteger(str)) {
            throw ExpectedException("회차는 양수여야 합니다.")
        }
    }
}