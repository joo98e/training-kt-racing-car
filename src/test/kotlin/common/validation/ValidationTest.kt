package common.validation

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

        Assertions.assertTrue(Validation.isNumeric(case1))
        Assertions.assertTrue(Validation.isNumeric(case2))
        Assertions.assertTrue(Validation.isNumeric(case3))
    }

    @DisplayName("숫자 형식 확인 테스트")
    @Test
    fun isNotNegativeNumber() {
    }
}