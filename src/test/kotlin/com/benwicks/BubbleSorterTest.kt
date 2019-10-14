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

    @Test
    fun `Given a list with two items, when they are swapped, then the two items are reversed`() {
        val twoItems = mutableListOf(0, 1)
        val reversedTwoItems = twoItems.reversed()

        BubbleSorter.swapItems(twoItems, 0, 1)

        assertEquals(
            reversedTwoItems,
            twoItems
        )
    }
}