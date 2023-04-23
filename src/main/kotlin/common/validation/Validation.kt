package common.validation

object Validation {
    fun isEmpty(str: String): Boolean {
        return str.isEmpty()
    }

    fun isNumeric(input: String): Boolean {
        return input.matches("-?\\d+(\\.\\d+)?".toRegex())
    }

    fun isNegativeInteger(str: String): Boolean {
        return !str.matches("\\d+".toRegex())
    }
}