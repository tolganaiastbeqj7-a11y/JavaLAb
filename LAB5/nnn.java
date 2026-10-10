public class nnn {
    public static double calcIMT(double ves, double rost) {
        return ves / (rost * rost);
    }

    public static String recommendationIMT(double imt) {
        if (imt < 18.5) {
            return "Ниже нормы";
        } else if (imt >= 18.5 && imt < 25) {
            return "Нормальный вес";
        } else if (imt >= 25 && imt < 30) {
            return "Избыточный вес";
        } else {
            return "Ожирение";
        }
    }

    public static void main(String[] args) {
        double imt = calcIMT(75, 1.75);
        System.out.println("ДМИ: " + imt);
        System.out.println("Ұсыныс: " + recommendationIMT(imt));
    }
}