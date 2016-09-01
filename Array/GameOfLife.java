public class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = getPoint(i,j,board);
                if (board[i][j] == 0) {
                    if (count == 3) board[i][j] += 10;  //using plus ten to mark
                } else {
                    if (count == 2 || count == 3) board[i][j] += 10;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] /= 10;
            }
        }
    }
    public int getPoint(int x, int y, int[][] board) {
        int c = 0;
        for (int i = x - 1; i <= x + 1; i++) {
          for (int j = y - 1; j <= y + 1; j++) {
              if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || (i == x && j == y))
              continue;
              if (board[i][j] % 10 == 1) c++;
          }
        }
        return c;
    }
}