import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;
public class TestScanner4 {
    public static void main(String[] args) {
        int guessNumber = new Random().nextInt(20) + 1;
        int tries = 0;
        Scanner sc = new Scanner(System.in);

        out.println("Введите ваше имя:");
        String name = sc.next();

        out.println(name + ", введите ваше целое число от 1 до 20:");

        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            tries++;

            if (number != guessNumber) {
                out.println("Не угадали ... попытка " + tries +
                        "\nВведите ваше число или нажмите любую клавишу для выхода");
            } else {
                out.println("Угадали! Пока!");
                break;
            }
        }
    }
}
