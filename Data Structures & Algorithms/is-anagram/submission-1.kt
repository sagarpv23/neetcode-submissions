class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val map1 = HashMap<Char, Int>();
        val map2 = HashMap<Char, Int>();

        for (char in s) {
            map1[char] = (map1[char] ?: 0) + 1
        }

        for (char in t) {
            map2[char] = (map2[char] ?: 0) + 1
        }

        return map1 == map2
    }
}
