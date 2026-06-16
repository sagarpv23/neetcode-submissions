class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val map = HashMap<Int, Int>()
        for (num in nums) {
            map.compute(num) {_, value -> (value ?: 0) + 1}
        }
        return map.values.any {it > 1}
    }
}
