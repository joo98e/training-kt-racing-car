package common.validation

import common.exception.ExpectedException

object Validation {
    fun isEmpty(str: String, exceptionMessage: String) {
        if (str.isEmpty()) {
            throw ExpectedException(exceptionMessage)
        }
    }

    fun isNaN(target: Double, exceptionMessage: String) {
        if (target.isNaN()) {
            throw ExpectedException(exceptionMessage)
        }
    }
}