class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>();
        for ((index, num) in nums.withIndex()) {
            val diff = target - num;
            if (diff !in map) {
                map.put(num, index);
            } else {
                return intArrayOf(map[diff]!!, index);
            }
        }
        return intArrayOf();
        
    }
}
