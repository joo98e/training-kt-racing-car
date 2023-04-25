package view

import common.exception.ExpectedException
import common.utils.StringListUtil
import common.utils.StringUtil
import common.validation.Validation

object InputValidation {
    fun isValidateLapsCount(str: String) {
        if (str.isEmpty()) {
            throw ExpectedException("회차를 입력해 주세요.")
        }

        if (Validation.isNotNumeric(str)) {
            throw ExpectedException("회차는 숫자 형식이어야 합니다.")
        }

        if (Validation.isNegativeInteger(str)) {
            throw ExpectedException("회차는 양수여야 합니다.")
        }
    }

    fun isValidateNamesOfCars(str: String) {
        if (str.isEmpty()) {
            throw ExpectedException("경주할 자동차 이름을 입력해 주세요.")
        }

        val stringList = StringUtil.splitter(str, ",")

        if (StringListUtil.hasDuplicates(stringList)) {
            throw ExpectedException("입력 값 중 중복된 이름이 있습니다.")
        }
    }
}