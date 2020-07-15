public class CMYKtoRGB {
    public static void main(String[] args) {

        // CMYK

        double C = Double.parseDouble(args[0]);
        double M = Double.parseDouble(args[1]);
        double Y = Double.parseDouble(args[2]);
        double K = Double.parseDouble(args[3]);

        // RGB

        double White = 1 - K;
        double Red = 255 * White * (1 - C);
        double Green = 255 * White * (1 - M);
        double Blue = 255 * White * (1 - Y);
        // int Red = (int) Math.round((255 * (1 - K) * (1 - C)));
        // int Green = (int) Math.round((255 * (1 - K) * (1 - M)));
        // int Blue = (int) Math.round((255 * (1 - K) * (1 - Y)));

        // Convert to Int

        // int W = (int) White;
        // int R = (int) Red;
        // int G = (int) Green;
        // int B = (int) Blue;

        int W = (int) White;
        int R = (int) Math.round(Red);
        int G = (int) Math.round(Green);
        int B = (int) Math.round(Blue);

        // Outputs

        System.out.println("red = " + R);
        System.out.println("green = " + G);
        System.out.println("blue = " + B);

    }

}
