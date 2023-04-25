package common.utils

object StringListUtil {
    fun hasDuplicates(arr: List<String>): Boolean {
        val set = HashSet<String>()
        for (s in arr) {
            if (!set.add(s)) {
                return true
            }
        }
        return false
    }
}