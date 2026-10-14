class Solution {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()

        for (c in s) {
            when (c) {
                // If it's an opening bracket, push it to the stack
                '(', '{', '[' -> stack.add(c)
                
                // If it's a closing bracket, check the top of the stack
                ')' -> if (stack.removeLastOrNull() != '(') return false
                '}' -> if (stack.removeLastOrNull() != '{') return false
                ']' -> if (stack.removeLastOrNull() != '[') return false
            }
        }
        return stack.isEmpty()
    }
}
