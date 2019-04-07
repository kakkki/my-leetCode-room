import java.util.HashMap

class TwoSum {

    /**
     * For Test
     */
    fun solve(nums: IntArray, target: Int): IntArray {
        return twoSumHashTable(nums, target)
    }

    fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        var isFinished = false
        run loopFirst@{
            nums.forEachIndexed { index1, data1 ->
                run loopSecond@{
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

    fun twoSumHashTable(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        /**
         * キーに入れることで、O(1)で探索できる
         */
        for (i in nums.indices) {
            println("i : $i")
            map[nums[i]] = i
        }
        println("map.size : ${map.size}")

        for (i in nums.indices) {
            println("i : $i")
            val complement = target - nums[i]

            /**
             * map.containsKey(complement) はO(1)
             */
            if (map.containsKey(complement) && map[complement] != i) {
                map[complement]?.let {
                    println("map[complement] : $it")
                    return intArrayOf(i, it)
                }
            }
        }
        throw IllegalArgumentException("No two sum solution")
    }
}