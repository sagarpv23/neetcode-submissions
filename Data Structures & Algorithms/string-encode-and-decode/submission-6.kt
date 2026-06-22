class Solution {

    fun encode(strs: List<String>): String {
        var encodedString = ""
        for (string in strs) {
            val delimiter = string.length.toString() + "#"
            encodedString = encodedString + delimiter + string
        }
        return encodedString
    }

    fun decode(str: String): List<String> {
        val decodedStrings = mutableListOf<String>()
        var i = 0
        while (i < str.length) {   
            var j = i
            while (str.get(j) != '#') {
                j++
            }
            val length = str.substring(i, j).toInt()
            i = j + 1 + length
            decodedStrings.add(str.substring(j + 1, i))
        }
        return decodedStrings.toList()
    }
}
