public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double r = 6371.0;
        double sin1 = Math.sin((Math.toRadians(y2) - Math.toRadians(y1)) / 2);
        double sin2 = Math.sin((Math.toRadians(x2) - Math.toRadians(x1)) / 2);
        double cos1 = Math.cos(Math.toRadians(x1));
        double cos2 = Math.cos(Math.toRadians(x2));
        double sqrt = Math.sqrt((sin2 * sin2) + (cos1 * cos2 * sin1 * sin1));
        double asin = Math.asin(sqrt);
        double distance = 2 * r * asin;
        System.out.println(distance + " kilometers");
    }
}
