import java.util.Scanner;
import static java.lang.System.out;

public class TestScanner3 {
    public static void main(String[] args) {
        int guessNumber = 100;
        int tries = 0;
        Scanner sc = new Scanner(System.in);

        out.println("Введите ваше имя:");
        String name = sc.next();

        out.println(name + ", введите ваше целое число:");

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