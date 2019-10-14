package com.benwicks

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BubbleSorterTest {
    @Test
    fun `Given a reverse-ordered list, when it is bubble sorted, then it is correctly ordered`() {
        val reverseOrderedList = (100 downTo 0).toList()

        val bubbleSortedList = BubbleSorter.sort(reverseOrderedList)

        assertEquals(
            reverseOrderedList.reversed(),
            bubbleSortedList
        )
    }
}