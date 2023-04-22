package utils

object StringUtil {
    fun splitter(str: String, criteria: String): List<String> {
        return str.split(criteria).filterNot { it.isEmpty() }
    }
}