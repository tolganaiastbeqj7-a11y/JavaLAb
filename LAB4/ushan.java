public class ushan {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.print("Үшбұрыш бар болуы мүмкін. Түрі: ");
            if (a == b && b == c) {
                System.out.println("Теңқабырғалы");
            } else if (a == b || b == c || a == c) {
                System.out.println("Теңбүйірлі");
            } else {
                System.out.println("Әртүрлі қабырғалы");
            }
        } else {
            System.out.println("Мұндай қабырғалармен үшбұрыш болмайды.");
        }
    }
}