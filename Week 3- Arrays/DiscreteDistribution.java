/* *****************************************************************************
 *  Name:              Keshav Mishra
 *  Coursera User ID:  123456
 *  Last modified:     January 17, 2024
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = args.length - 1;
        int[] a = new int[n];
        int[] csum = new int[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
            csum[i + 1] = csum[i] + a[i];
        }

        int smax = csum[csum.length - 1]; // Largest number in the cum. sum array

        for (int i = 1; i <= m; i++)  // Running the loop to generate m indices
        {
            int r = (int) (Math.random() * smax);

            int j = 1;
            while (j < n && !(r > csum[j - 1] && r <= csum[j])) {
                j++;
            }
            System.out.print(j + " ");
            if (i % 25 == 0) System.out.println();

        }

    }
}
