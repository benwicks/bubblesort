package com.benwicks

object BubbleSorter {
    fun <T : Comparable<T>> sort(list: List<T>): List<T> {
        val sortedList = list.toMutableList()
        (0 until (list.size - 1)).forEach { pass ->
            (0 until (sortedList.size - pass - 1)).forEach { i ->
                if (sortedList[i] > sortedList[i + 1]) {
                    swapItems(sortedList, i, i + 1)
                }
            }
        }
        return sortedList
    }

    internal fun <T : Any> swapItems(list: MutableList<T>, i: Int, j: Int) {
        val temporaryItem = list[i]
        list[i] = list[j]
        list[j] = temporaryItem
    }
}