import java.util.Scanner;

public class bmi {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Салмағыңызды енгізіңіз (кг, мысалы: 65): ");
            double weight = scanner.nextDouble();

            System.out.print("Бойыңызды енгізіңіз (метрмен, мысалы: 1.75): ");
            double height = scanner.nextDouble();

            double bmi = weight / (height * height);

            System.out.printf("Сіздің дене массаңыздың индексі (ДМИ): %.2f\n", bmi);

            if (bmi < 18.5) {
                System.out.println("Статус: Салмақ жеткіліксіз.");
            } else if (bmi >= 18.5 && bmi < 25) {
                System.out.println("Статус: Қалыпты салмақ. Жарайсыз!");
            } else if (bmi >= 25 && bmi < 30) {
                System.out.println("Статус: Артық салмақ.");
            } else {
                System.out.println("Статус: Семіздік.");
            }

            scanner.close();
        }
    }

