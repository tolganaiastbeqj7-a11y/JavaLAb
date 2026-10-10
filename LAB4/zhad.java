public class zhad {

    public static void printBmiRecommendation(double bmi) {
        if (bmi < 18.5) {
            System.out.println("Салмақ аз");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Қалыпты салмақ");
        } else {
            System.out.println("Артық салмақ");
        }
    }

    public static void printGradeRecommendation(int score) {
        if (score >= 0 && score <= 50) {
            System.out.println("Оқудан шығару");
        } else if (score <= 75) {
            System.out.println("Құттықтау");
        } else if (score <= 90) {
            System.out.println("Грамота тапсыру");
        } else if (score <= 100) {
            System.out.println("Рубик кубигін сыйлау");
        }
    }

    public static void main(String[] args) {
        printBmiRecommendation(22.5);
        printGradeRecommendation(85);
    }
}
