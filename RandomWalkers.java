/* *****************************************************************************
 *  Name:              Keshav Mishra
 *  Coursera User ID:  123456
 *  Last modified:     January 17, 2024
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int sum = 0;
        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;
            int steps = 0;

            while (Math.abs(x) + Math.abs(y) != r) {
                double rand = Math.random();
                if (rand <= 0.25) x++;
                else if (rand <= 0.50) y--;
                else if (rand <= 0.75) x--;
                else y++;
                steps++;
            }
            sum += steps;

        }
        double avg = (double) sum / trials;
        System.out.println("average number of steps = " + avg);
    }
}
