/* *****************************************************************************
 *  Name:              Keshav Mishra
 *  Coursera User ID:  123456
 *  Last modified:     January 21, 2024
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]); // Number of possible birthdays
        int trials = Integer.parseInt(args[1]);
        int[] personCount = new int[n + 2];

        for (int i = 0; i < trials; i++) {
            boolean[] hasbirthday = new boolean[n];

            for (int j = 1; j <= n + 1; j++) {
                int d = (int) (Math.random() * n);
                if (hasbirthday[d]) {
                    personCount[j]++;
                    break;
                }
                else hasbirthday[d] = true;
            }
        }
        double fraction = 0.0;
        for (int j = 1; fraction < 0.5; j++) {
            fraction += (double) personCount[j] / trials;
            System.out.printf(j + "\t" + personCount[j] + "\t" + "%.8f", fraction);
            System.out.println();
        }

    }


}

