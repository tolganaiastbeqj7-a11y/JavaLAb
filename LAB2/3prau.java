public class prau {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        double c = Math.sqrt(a * a + b * b);

        double area = 0.5 * a * b;
        double perimeter = a + b + c;

        System.out.println("Катет а: " + a);
        System.out.println("Катет b: " + b);
        System.out.println("Гипотенуза с: " + c);
        System.out.println("Үшбұрыштың ауданы: " + area);
        System.out.println("Үшбұрыштың периметрі: " + perimeter);
    }
}
