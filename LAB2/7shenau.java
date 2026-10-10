public class shenau {
        public static void main(String[] args) {
            int radius = 5;

            method7(radius);
        }

        public static void method7(int r) {
            double area = Math.PI * r * r;

            System.out.println("Шеңбердің радиусы: " + r);
            System.out.println("Шеңбердің (дөңгелектің) ауданы: " + area);
        }
    }
