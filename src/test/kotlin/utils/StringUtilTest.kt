package utils

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class StringUtilTest {
    private val criteria: String = ","

    @DisplayName("콤마 분리 테스트")
    @Test
    fun splitStringByComma() {
        val str = "콤,마,분,리,테,스,트"
        val stringList = StringUtil.splitter(str, criteria)
        Assertions.assertThat(stringList).hasSize(7)
        Assertions.assertThat(stringList[0]).isEqualTo("콤")
        Assertions.assertThat(stringList[1]).isEqualTo("마")
        Assertions.assertThat(stringList[2]).isEqualTo("분")
        Assertions.assertThat(stringList[3]).isEqualTo("리")
        Assertions.assertThat(stringList[4]).isEqualTo("테")
        Assertions.assertThat(stringList[5]).isEqualTo("스")
        Assertions.assertThat(stringList[6]).isEqualTo("트")
    }

    @DisplayName("콤마가 있어도, 문자가 없으면 취급하지 않음")
    @Test
    fun splitStringByComma1() {
        val str = ".,,콤,마,,"
        val stringList = StringUtil.splitter(str, criteria)
        Assertions.assertThat(stringList).hasSize(3)
        Assertions.assertThat(stringList[0]).isEqualTo(".")
        Assertions.assertThat(stringList[1]).isEqualTo("콤")
        Assertions.assertThat(stringList[2]).isEqualTo("마")
    }
}