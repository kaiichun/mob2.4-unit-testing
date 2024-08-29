package com.alvin.mob24test.ui

import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Test
@OptIn(ExperimentalCoroutinesApi::class)
class HomeViewModelTest {
    private val viewModel = HomeViewModel()
    @Before
    fun setup() {
        val testDispatcher = UnconfinedTestDispatcher()
        Dispatchers.setMain(testDispatcher)
    }

    @After
    fun reset() {
        Dispatchers.resetMain()
    }

    @Test
    fun `test coroutine`() = runTest {
        assertEquals(viewModel.fetchData(), "Hello World")
    }

    @Test
    fun `test state flow`() = runTest {
        viewModel.loadMessage()
        assertEquals(viewModel.msg.value, "HelloStateFlow")
    }

}