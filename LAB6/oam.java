import java.util.Random;

    public class oam {
        public static void main(String[] args) {
            Random rand = new Random();
            long sum = 0;
            int count = 2500;

            for (int i = 0; i < count; i++) {
                sum += rand.nextInt(100);
            }

            double avg = (double) sum / count;
            System.out.println("2500 санның орташа мәні: " + avg);
        }
    }

