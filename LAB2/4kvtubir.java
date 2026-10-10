public class kvtubir {
    public static void main(String[] args)
    {
        double a = 1.0;
        double b = -5.0;
        double c = 6.0;

        System.out.println("Теңдеу: " + a + "x^2 + (" + b + ")x + (" + c + ") = 0");

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Теңдеудің екі түбірі бар:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Теңдеудің бір түбірі бар:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Теңдеудің нақты түбірлері жоқ (дискриминант нөлден кіші).");
        }
    }
}