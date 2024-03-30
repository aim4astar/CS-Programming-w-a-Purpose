/* *****************************************************************************
 *  Name:              Keshav Mishra
 *  Coursera User ID:  123456
 *  Last modified:     March 1, 2024
 **************************************************************************** */

import java.util.Scanner;

public class TWODARRAY {
    public static void main(String[] args) {


        StdOut.println("Enter number of rows of array 1: ");
        int r1 = StdIn.readInt();
        StdOut.println("Enter number of columns of array 1: ");
        int c1 = StdIn.readInt();
        int[][] a1 = new int[r1][c1];

        StdOut.println("Enter array elements: ");
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a1[i][j] = sc1.nextInt();
            }
        }

        StdOut.println("Enter number of rows of array 2: ");
        int r2 = StdIn.readInt();
        StdOut.println("Enter number of column of array 2: ");
        int c2 = StdIn.readInt();
        int[][] a2 = new int[r2][c2];

        if (c1 != r2) {
            StdOut.println("Error: Cannot multiply! \n");
            return;
        }

        StdOut.println("Enter array elements: ");
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                a2[i][j] = sc2.nextInt();
            }
        }


        int[][] a3 = new int[r1][c2];


        for (int i = 0; i < r1; i++) {
            for (int k = 0; k < c2; k++) {
                for (int j = 0; j < c1; j++) {

                    a3[i][k] += a1[i][j] * a2[j][k];

                }

            }
        }
        StdOut.println("The new matrix obtained is: \n");
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < r2; j++) {
                StdOut.print(" " + a3[i][j]);
            }
            StdOut.println();
        }

    }
}
