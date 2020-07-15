public class RightTriangle {
    public static void main(String[] args) {

        // Integers

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // int d = a * a;
        // int e = b * b;
        // int f = c * c;

        // Boolean statements

        boolean arePositive;

        arePositive = (a > 0 && b > 0 && c > 0);
        // arePositive = (d > 0 && e > 0 && f > 0);

        boolean isRightTriangle;

        isRightTriangle = (a * a + b * b == c * c) && arePositive
                || (c * c + b * b == a * a) && arePositive
                || (a * a + c * c == b * b) && arePositive;

        // isRightTriangle = (d + e == f) && arePositive;
        // isRightTriangle = (d + f == e) && arePositive;
        // isRightTriangle = (e + f == d) && arePositive;
        // isRightTriangle = (e + d == f) && arePositive;
        // isRightTriangle = (f + d == e) && arePositive;
        // isRightTriangle = (f + e == d) && arePositive;
        // isRightTriangle = (a == 3) && (b == 4) && (c == 5);

        // Output

        System.out.println(isRightTriangle);

    }
}
