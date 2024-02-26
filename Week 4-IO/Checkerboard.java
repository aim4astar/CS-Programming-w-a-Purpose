/* *****************************************************************************
 *  Name:              Keshav Mishra
 *  Coursera User ID:  123456
 *  Last modified:     February 23, 2024
 **************************************************************************** */

public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        StdDraw.setScale(0.0, n);
        StdDraw.enableDoubleBuffering();


        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (Math.abs(i - j) % 2 == 0) StdDraw.setPenColor(StdDraw.BLUE);
                else StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
            }
        }
        StdDraw.show();

    }
}
