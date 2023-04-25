package common.utils

object StringUtil {
    fun splitter(str: String, delimiter: String): List<String> {
        return str.split(delimiter).filterNot { it.isEmpty() }
    }

    fun checkOverLength(str: String, length: Int): Boolean {
        return str.length > length
    }
}