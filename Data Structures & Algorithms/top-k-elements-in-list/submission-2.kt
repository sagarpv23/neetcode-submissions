class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int, Int>();
        for (num in nums) {
            map.compute(num) {_, value -> (value ?: 0) + 1}
        }
        return map.entries.sortedByDescending { it.value }.take(k).map { it.key }.toIntArray()  
    }
}
