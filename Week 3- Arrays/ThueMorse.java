/* *****************************************************************************
 *  Name:              Keshav Mishra
 *  Coursera User ID:  123456
 *  Last modified:     January 19, 2024
 **************************************************************************** */

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (n < 0) return;
        int powerof2;
        powerof2 = (int) Math.pow(2, Math.ceil(Math.log(n) / Math.log(2)));

        boolean[] morseSequence = new boolean[powerof2];
        morseSequence[0] = false;

        int indicator = 1;
        while (indicator < powerof2) {
            for (int i = 0; i < indicator; i++) {
                morseSequence[indicator + i] = !morseSequence[i];
            }
            indicator *= 2;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (morseSequence[i] == morseSequence[j]) System.out.print("+  ");
                else System.out.print("-  ");
            }
            System.out.println();
        }
    }
}
