public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int i;
        int j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (Math.abs(j - i) > width) System.out.print("0" + "  ");
                else System.out.print("*" + "  ");
            }
            System.out.println();
        }
    }
}
