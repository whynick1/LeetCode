// false solve the problem within 2 nested for loops, and use more than 10 HashSet
// Very Smart solution, something genious we must learn from it!
// That encode the value into 3 type of info, for 3 different check.
// Collect the set of things we see, encoded as strings. For example:
// '4' in row 7 is encoded as "(4)7".
// '4' in column 7 is encoded as "7(4)".
// '4' in the top-right block is encoded as "0(4)2".
// Scream false if we ever fail to add something because it was already added (i.e., seen before).
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                if (board[i][j] != '.') {
                    String b = "(" + board[i][j] + ")";
                    if (!seen.add(b + i) || !seen.add(j + b) || !seen.add(i/3 + b + j/3))
                        return false;
                }
            }
        }
        return true;
    }
}