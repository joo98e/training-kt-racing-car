package domain.car

import common.exception.ExpectedException
import common.utils.StringUtil

class Car(
    val name: String,
    var position: Int,
) {
    init {
        if (StringUtil.checkOverLength(this.name, maxNamingLength)) {
            throw ExpectedException("차량의 이름은 5자 이하이어야 합니다.")
        }
    }

    fun move(): Int {
        this.position += 1
        return this.position
    }

    companion object {
        private const val maxNamingLength: Int = 5
    }
}