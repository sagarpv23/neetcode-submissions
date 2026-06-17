class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map1 = HashMap<String, MutableList<String>>();

        for (string in strs) {
            val sorted = string.toCharArray().sorted().joinToString("");
            map1.getOrPut(sorted) { mutableListOf() }.add(string);
        }
        return map1.values.map { it.toList() };
    }
}
