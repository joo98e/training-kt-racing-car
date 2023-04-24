package common.validation

object Validation {
    fun isNumeric(str: String): Boolean {
        return str.matches("-?\\d+(\\.\\d+)?".toRegex())
    }

    fun isNotNumeric (str: String): Boolean {
        return !isNumeric(str)
    }

    fun isNegativeInteger(str: String): Boolean {
        require(isNumeric(str)) { "숫자 형식이 아닙니다." }
        return str.toInt() < 0
    }
}