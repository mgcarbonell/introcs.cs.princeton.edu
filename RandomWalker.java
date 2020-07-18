public class RandomWalker {
    public static void main(String[] args) {
        // okay here goes all my ints
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int step = 0;
        System.out.println("(" + x + ", " + y + ")"); // Let's try this here
        while (Math.abs(x) + Math.abs(y) < r) {

            if (Math.random() < 0.25) x++;
            else if (Math.random() <= 0.5) x--;
            else if (Math.random() <= 0.75) y++;
            else if (Math.random() <= 1) y--;
            System.out.println("(" + x + ", " + y + ")"); // Add here too
            step++;
        }
        System.out.println("steps = " + step);
    }
}
