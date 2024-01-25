public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);
        double white = 1 - black;
        double red = (255 * white * (1 - cyan));
        double green = (255 * white * (1 - magenta));
        double blue = (255 * white * (1 - yellow));
        long redr = Math.round(red);
        long greenr = Math.round(green);
        long bluer = Math.round(blue);
        System.out.println("red = " + redr);
        System.out.println("green = " + greenr);
        System.out.println("blue = " + bluer);
    }
}
