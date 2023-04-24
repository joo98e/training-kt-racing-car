package common.utils

import io.kotest.matchers.collections.shouldContainExactly
import io.kotest.matchers.shouldBe
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class StringUtilTest {
    private val delimiter: String = ","

    @DisplayName("콤마 분리 테스트")
    @Test
    fun splitStringByComma() {
        val str = "콤,마,분,리,테,스,트"
        val stringList = StringUtil.splitter(str, delimiter)

        stringList shouldBe listOf(
            "콤",
            "마",
            "분",
            "리",
            "테",
            "스",
            "트",
        )
    }

    @DisplayName("콤마가 있어도, 문자가 없으면 취급하지 않음")
    @Test
    fun splitStringByComma1() {
        val str = ".,,콤,마,,"
        val stringList = StringUtil.splitter(str, delimiter)
        Assertions.assertThat(stringList).hasSize(3)
        Assertions.assertThat(stringList[0]).isEqualTo(".")
        Assertions.assertThat(stringList[1]).isEqualTo("콤")
        Assertions.assertThat(stringList[2]).isEqualTo("마")
    }
}