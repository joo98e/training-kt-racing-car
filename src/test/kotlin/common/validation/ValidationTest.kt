package common.validation

import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ValidationTest {

    @DisplayName("숫자 형식 확인 테스트")
    @Test
    fun isNumericTest() {
        val case1 = "1"
        val case2 = "123"
        val case3 = "0.123"
        val case4 = "-1"

        Validation.isNumeric(case1) shouldBe true
        Validation.isNumeric(case2) shouldBe true
        Validation.isNumeric(case3) shouldBe true
        Validation.isNumeric(case4) shouldBe true
    }

    @DisplayName("숫자 형식 확인 테스트")
    @Test
    fun isNotNegativeNumberTest() {
        val case1 = "숫자가아님"
        val case2 = "1."
        val case3 = "1,1"

        Validation.isNotNumeric(case1) shouldBe true
        Validation.isNotNumeric(case2) shouldBe true
        Validation.isNotNumeric(case3) shouldBe true
    }

    @DisplayName("자료형과 상관없이 양수, 음수 테스트")
    @Test
    fun isNegativeIntegerTest() {
        val case1 = "-1"
        val case2 = "1"
        val case3 = -1
        val case4 = 1

        Validation.isNegativeInteger(case1) shouldBe true
        Validation.isNegativeInteger(case2) shouldBe false
        Validation.isNegativeInteger(case3) shouldBe true
        Validation.isNegativeInteger(case4) shouldBe false
    }
}