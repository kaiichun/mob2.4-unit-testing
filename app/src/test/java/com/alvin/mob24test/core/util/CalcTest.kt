package com.alvin.mob24test.core.util

import junit.framework.TestCase.assertEquals
import org.junit.Test

class CalcTest {

    @Test
    fun `4 + 4 should return 8`() {
        assertEquals(Calc.add(4, 4) ,8)
    }

    @Test
    fun `2 + 2 should return 4`() {
        assertEquals(Calc.add(2, 2) ,4)
    }

}