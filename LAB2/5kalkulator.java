import java.util.Scanner;

public class kalkulator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Калькуляторға қош келдіңіз!");
            System.out.println("Операцияны таңдаңыз:");
            System.out.println("1 - Қосу (+)");
            System.out.println("2 - Азайту (-)");
            System.out.println("3 - Көбейту (*)");
            System.out.println("4 - Бөлу (/)");
            System.out.println("5 - Синус (sin)");
            System.out.println("6 - Косинус (cos)");
            System.out.println("7 - Квадрат түбір (sqrt)");

            System.out.print("Операция нөмірін енгізіңіз (1-7): ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Бірінші санды енгізіңіз: ");
                double num1 = scanner.nextDouble();
                System.out.print("Екінші санды енгізіңіз: ");
                double num2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Нәтиже: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Нәтиже: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Нәтиже: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Нәтиже: " + (num1 / num2));
                        } else {
                            System.out.println("Қате! Санды нөлге бөлуге болмайды.");
                        }
                        break;
                }
            }
            else if (choice >= 5 && choice <= 7) {
                System.out.print("Санды енгізіңіз: ");
                double num = scanner.nextDouble();

                switch (choice) {
                    case 5:
                        System.out.println("Нәтиже sin(" + num + "°): " + Math.sin(Math.toRadians(num)));
                        break;
                    case 6:
                        System.out.println("Нәтиже cos(" + num + "°): " + Math.cos(Math.toRadians(num)));
                        break;
                    case 7:
                        if (num >= 0) {
                            System.out.println("Нәтиже sqrt(" + num + "): " + Math.sqrt(num));
                        } else {
                            System.out.println("Қате! Теріс саннан түбір шығаруға болмайды.");
                        }
                        break;
                }
            } else {
                System.out.println("Қате таңдау! 1-ден 7-ге дейінгі санды енгізіңіз.");
            }

            scanner.close();
        }
    }

