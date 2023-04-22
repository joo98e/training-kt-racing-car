package common.validation

import common.exception.ExpectedException

object Validation {
    fun isEmpty(str: String, exceptionMessage: String) {
        if (str.isEmpty()) {
            throw ExpectedException(exceptionMessage)
        }
    }

    fun isNaN(target: Double, exceptionMessage: String) {
        isEmpty(target.toString(), "값을 입력해 주세요.")

        if (target.isNaN()) {
            throw ExpectedException(exceptionMessage)
        }
    }
}