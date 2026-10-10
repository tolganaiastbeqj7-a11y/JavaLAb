import java.util.Scanner;
public class kvten{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("a, b, c енгізіңіз: ");
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

            double d = b * b - 4 * a * c;
            if (d > 0) {
                System.out.println("x1 = " + ((-b + Math.sqrt(d)) / (2 * a)));
                System.out.println("x2 = " + ((-b - Math.sqrt(d)) / (2 * a)));
            } else if (d == 0) {
                System.out.println("x = " + (-b / (2 * a)));
            } else {
                System.out.println("Нақты түбірлері жоқ");
            }
        }
    }

