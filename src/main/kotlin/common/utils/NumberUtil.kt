package common.utils

object NumberUtil {
    fun getRandomNumber(min: Int, max: Int): Int {
        require(max > min) { "최대값이 최소값보다 작습니다." }
        return (min..max).random()
    }
}