/* *****************************************************************************
 *  Name:              Keshav Mishra
 *  Coursera User ID:  123456
 *  Last modified:     February 14, 2024
 **************************************************************************** */

public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] a = new int[m + 1];
        double count = 0.0;
        double entropy = 0.0;


        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            a[x]++;
            count++;
        }
        for (int i = 1; i <= m; i++) {
            double p = 0.0;
            if (a[i] == 0) continue;
            p = -((a[i] / count) * (Math.log(a[i] / count) / Math.log(2)));
            // Change of base formula   logx (b) = logy (b) / logy (x)
            entropy += p;

        }
        StdOut.printf("%.4f \n", entropy);

    }
}
