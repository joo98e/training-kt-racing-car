package common.utils

object StringUtil {
    fun splitter(str: String, delimiter: String): List<String> {
        return str.split(delimiter).filterNot { it.isEmpty() }
    }
}