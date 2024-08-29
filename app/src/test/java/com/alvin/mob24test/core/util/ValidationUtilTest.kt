package com.alvin.mob24test.core.util

import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class ValidationUtilTest {

    @Test
    fun `validateEmail should return true for a@acom`() {
        assertTrue(ValidationUtil.validateEmail("a@a.com"))
    }
    @Test
    fun `validateEmail should return false for a@1234`() {
        assertFalse(ValidationUtil.validateEmail("a@1234"))
    }
    @Test
    fun `validateEmail should return false for a@acom$`() {
        assertFalse(ValidationUtil.validateEmail("a@acom$"))
    }

}