/* *****************************************************************************
 *  Name:              Keshav Mishra
 *  Coursera User ID:  123456
 *  Last modified:     January 23, 2024
 **************************************************************************** */

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        boolean[][] minePosition = new boolean[m + 2][n + 2];
        int[][] grid = new int[m + 2][n + 2];

        while (k > 0) {
            int rx = 1 + (int) (Math.random() * m);
            int ry = 1 + (int) (Math.random() * n);
            if (!minePosition[rx][ry]) {
                minePosition[rx][ry] = true;
                k--;
            }
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (!minePosition[i][j]) {
                    int mines = 0;
                    for (int a = i - 1; a <= i + 1; a++) {
                        for (int b = j - 1; b <= j + 1; b++) {
                            if (minePosition[a][b]) {
                                mines++;
                            }
                        }
                    }
                    grid[i][j] = mines;
                }
                else grid[i][j] = -1;
            }
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (grid[i][j] < 0) {
                    System.out.print((j == 1 ? "" : " ") + "*" + (j == n ? "" : " "));
                }
                else {
                    System.out.print((j == 1 ? "" : " ") + grid[i][j] + (j == n ? "" :
                                                                         " "));
                }
            }
            System.out.println();
        }

    }
}




