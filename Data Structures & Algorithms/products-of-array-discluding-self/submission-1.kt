class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val suffix = IntArray(nums.size)
        val prefix = IntArray(nums.size)
        val ans = IntArray(nums.size)
        suffix[0] = 1
        prefix[nums.size - 1] = 1
        for (i in 1 until nums.size) {
            suffix[i] = nums[i-1] * suffix[i-1] 
        }

        for (i in (nums.size - 2) downTo 0) {
            prefix[i] = nums[i+1] * prefix[i+1]
        }

        for (i in 0 until nums.size) {
            ans[i] = suffix[i] * prefix[i]
        }

        return ans
    }
}
