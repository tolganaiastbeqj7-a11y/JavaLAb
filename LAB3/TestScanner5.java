
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;
public class TestScanner5 {
    public static void main(String[] args) {
        int guessNumber = new Random().nextInt(20) + 1;
        int tries = 0;

        ArrayList<Integer> previousInputs = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        out.println("Введите ваше имя:");
        String name = sc.next();

        out.println(name + ", введите ваше целое число (для выхода введите Q):");

        while (!sc.hasNext("Q")) {
            try {
                int number = Integer.parseInt(sc.next());

                if (previousInputs.contains(number)) {
                    out.println("Предупреждение: Вы уже вводили число " + number + "!");
                } else {
                    previousInputs.add(number);
                }

                if (number != guessNumber) {
                    tries++;
                    out.println("Не угадали ... попытка " + tries + "\nВведите ваше число или нажмите Q для выхода");
                } else {
                    out.println("Угадали! Пока!");
                    break;
                }
            } catch (NumberFormatException e) {
                out.println("Пожалуйста, введите корректное число или Q для выхода.");
            }
        }
    }
}