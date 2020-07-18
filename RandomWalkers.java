public class RandomWalkers {

    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int stepsSum = 0;


        for (int i = 1; i <= trials; i++) {

            int steps = 0;
            int x = 0;
            int y = 0;
            while (Math.abs(x) + Math.abs(y) != r) {

                double random = Math.random();

                if (random < 0.25) {
                    x++;
                } else if (random < 0.5) {
                    x--;
                } else if (random < 0.75) {
                    y++;
                } else {
                    y--;
                }
                steps++;
            }

            stepsSum += steps;
        }

        double aveSteps = ((double) stepsSum) / trials;

        System.out.println("average number of steps = " + aveSteps);

    }
}
