class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows: HashMap<Int, MutableList<Char>> = HashMap()
        val columns: HashMap<Int, MutableList<Char>> = HashMap()
        val square: HashMap<Pair<Int,Int>, MutableList<Char>> = HashMap()

        for (r in 0..8){
            for (c in 0..8){
                if(board[r][c]== '.'){
                    continue
                }
                val rowList = rows.getOrPut(r) { mutableListOf() }
                val colList = columns.getOrPut(c) { mutableListOf() }
                val squareList = square.getOrPut(Pair(r / 3, c / 3)) { mutableListOf() }
                if(board[r][c] in rowList || 
                   board[r][c] in colList ||
                   board[r][c] in squareList) {
                    return false
                }
                rowList.add(board[r][c])
                colList.add(board[r][c])
                squareList.add(board[r][c])
            }
        }
        return true
    }
}
