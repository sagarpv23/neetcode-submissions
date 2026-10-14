class Solution {
    fun isValid(s: String): Boolean {
        val map = hashMapOf(
            '}' to '{',
            ']' to '[',
            ')' to '('
        )
        val stack = mutableListOf<Char>()

        for(par in s) {
            if (par in map) {
                val last = stack.lastOrNull();
                if(last != map[par]) return false else stack.removeLast()
            } else {
                stack.add(par)
            }
        }
        return stack.isEmpty()
    }
}
