package common.utils

object NumberUtil {
    fun getRandomNumber(min: Int, max: Int): Int {
        require(max > min) { "Max number should be greater than min number" }
        return (min..max).random()
    }
}