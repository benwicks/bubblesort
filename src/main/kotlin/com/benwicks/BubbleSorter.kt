package com.benwicks

object BubbleSorter {
    fun <T : Comparable<T>> sort(list: List<T>): List<T> {
        val sortedList = list.toMutableList()
        for (pass in 0 until (list.size - 1)) {
            for (currentPosition in 0 until (sortedList.size - pass - 1)) {
                if (sortedList[currentPosition] > sortedList[currentPosition + 1]) {
                    val temporaryItem = sortedList[currentPosition]
                    sortedList[currentPosition] = sortedList[currentPosition + 1]
                    sortedList[currentPosition + 1] = temporaryItem
                }
            }
        }
        return sortedList
    }
}