public class BandMatrix {
    public static void main(String[] args) {
        // Print a square that visualizes divisors.
        int n = Integer.parseInt(args[0]); // 1 input
        int width = Integer.parseInt(args[1]); // 2 input
        // for (int i = 1; i < n; i++) { incorrect statement?
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= width) // deep math magic
                    System.out.print("*  "); // 0 does not go here switch them
                else
                    System.out.print("0  "); // this needs to be 0, was printing inverse
                // I swear to god don't fuck up I've spent hours doing this
            }
            System.out.println();
        }
    }
}
