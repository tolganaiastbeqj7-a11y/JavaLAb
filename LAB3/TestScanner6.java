import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class TestScanner6 {
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
                previousInputs.add(number);

                int count = Collections.frequency(previousInputs, number);

                if (count > 5) {
                    out.println("Пользователь не ведает, что творит");
                    return;
                } else if (count > 1) {
                    out.println("Предупреждение: Вы уже вводили число " + number + " (" + count + " раз)!");
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
