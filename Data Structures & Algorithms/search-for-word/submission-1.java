class Solution {
    public boolean helper(int i, int j, int k, int n, int m, char[][] board, String word) {
        if (k == word.length())
            return true;

        if (i < 0 || i >= n || j < 0 || j >= m || board[i][j] != word.charAt(k)) {
            return false;
        }

        char temp = word.charAt(k);
        board[i][j] = '#';

        boolean found = helper(i, j - 1, k + 1, n, m, board, word)
            || helper(i, j + 1, k + 1, n, m, board, word)
            || helper(i - 1, j, k + 1, n, m, board, word)
            || helper(i + 1, j, k + 1, n, m, board, word);

        board[i][j] = temp;

        return found;
    }

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (helper(i, j, 0, n, m, board, word)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
