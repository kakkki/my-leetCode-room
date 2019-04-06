class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        var isFinished = false
        run loopFirst@ {
            nums.forEachIndexed { index1, data1 ->
                run loopSecond@ {
                    nums.forEachIndexed { index2, data2 ->
                        if (data1 + data2 == target && index1 != index2) {
                            result.apply {
                                set(0, index1)
                                set(1, index2)
                            }
                            isFinished = true
                            println(100)
                            return@loopSecond
                        }
                    }
                }
                if (isFinished) return@loopFirst
            }
        }
        return result
    }
}