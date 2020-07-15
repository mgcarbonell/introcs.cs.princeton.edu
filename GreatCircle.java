public class GreatCircle {
    public static void main(String[] args) {
        
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double r = 6371.0;

        double g = Math.toRadians(x1);
        double t = Math.toRadians(x2);
        double x2x1 = t - g;
        double y2y1 = Math.toRadians(y2 - y1);

        double a = Math.sin(x2x1 / 2) * Math.sin(x2x1 / 2);
        double b = Math.cos(g) * Math.cos(t);
        double c = Math.sin(y2y1 / 2) * Math.sin(y2y1 / 2);
        double d = a + (b * c);
        double e = Math.sqrt(d);
        double f = 2 * r * (Math.asin(e));

        System.out.println(f + " Kilometers ");

    }
}
