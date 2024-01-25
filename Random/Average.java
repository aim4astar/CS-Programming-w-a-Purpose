/* *****************************************************************************
 *  Name:              Keshav Mishra
 *  Coursera User ID:  123456
 *  Last modified:     January 24, 2024
 **************************************************************************** */

public class Average {
    public static void main(String[] args) {
        double sum = 0.0;
        int n = 0;
        StdOut.print("Enter the numbers to be averaged: ");
        while (!StdIn.isEmpty()) {
            double x = StdIn.readDouble();
            sum += x;
            n++;
        }
        StdOut.println("Average is " + sum / n);

    }
}
