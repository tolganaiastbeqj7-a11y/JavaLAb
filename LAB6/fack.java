public class fack {
        public static void main(String[] args) {
            int n = 5;

            // for арқылы
            long factFor = 1;
            for (int i = 1; i <= n; i++) {
                factFor *= i;
            }
            System.out.println("for факториал: " + factFor);

            // while арқылы
            long factWhile = 1;
            int j = 1;
            while (j <= n) {
                factWhile *= j;
                j++;
            }
            System.out.println("while факториал: " + factWhile);
        }
    }
