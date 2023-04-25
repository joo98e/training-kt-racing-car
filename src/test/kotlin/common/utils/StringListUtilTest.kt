package common.utils

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class StringListUtilTest {

    @DisplayName("중복된 값이 있는지 검사 - 중복되지 않음")
    @Test
    fun hasDuplicatesTestWillBeFalsy() {
        val stringList = listOf("a", "d,", "f")
        val willNotDuplicates = StringListUtil.hasDuplicates(stringList)
        willNotDuplicates shouldBe false
    }

    @DisplayName("중복된 값이 있는지 검사 - 중복됨")
    @Test
    fun hasDuplicatesTestWillBeTruthy() {
        val stringList = listOf("a", "f", "f")
        val willNotDuplicates = StringListUtil.hasDuplicates(stringList)
        willNotDuplicates shouldBe true
    }


}