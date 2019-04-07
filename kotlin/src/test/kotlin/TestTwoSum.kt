import org.junit.Assert
import org.junit.Test

class TestTwoSum {

    @Test
    fun `sum_is_9`() {
        val target = 9
        val inputNums = IntArray(4).apply {
            set(0, 2)
            set(1, 7)
            set(2, 11)
            set(3, 15)
        }
        val result = TwoSum().solve(inputNums, target)
        Assert.assertEquals(
            inputNums.get(result.get(0))
                    + inputNums.get(result.get(1)),
            target
        )
    }

    @Test
    fun `not_same_index_when_a_index_is_0`() {
        val target = 6
        val inputNums = IntArray(3).apply {
            set(0, 3)
            set(1, 2)
            set(2, 4)
        }
        val result = TwoSum().solve(inputNums, target)
        Assert.assertEquals(
            inputNums.get(result.get(0))
                    + inputNums.get(result.get(1)),
            target
        )
        Assert.assertNotEquals(
            0,
            result.get(0) - result.get(1)
        )
    }

    @Test
    fun `not_same_index_when_a_index_is_otherwise_0`() {
        val target = 10
        val inputNums = IntArray(4).apply {
            set(0, 2)
            set(1, 5)
            set(2, 5)
            set(3, 11)
        }
        val result = TwoSum().solve(inputNums, target)
        Assert.assertEquals(
            inputNums.get(result.get(0))
                    + inputNums.get(result.get(1)),
            target
        )
        Assert.assertNotEquals(
            0,
            result.get(0) - result.get(1)
        )
    }

    @Test
    fun `sum_is_31`() {
        val target = 31
        val inputNums = IntArray(8).apply {
            set(0, 100)
            set(1, 100)
            set(2, 100)
            set(3, 100)
            set(4, 14)
            set(5, 100)
            set(6, 100)
            set(7, 17)
        }
        val result = TwoSum().solve(inputNums, target)
        println("result.get(0) : ${result.get(0)}")
        println("result.get(1) : ${result.get(1)}")
        Assert.assertEquals(
            inputNums.get(result.get(0))
                    + inputNums.get(result.get(1)),
            target
        )
    }

}