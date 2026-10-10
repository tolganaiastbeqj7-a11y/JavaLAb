public class matrix {
    public static void main(String[] args) {
        int[][] a = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j] = (i % 2 == 0) ? 0 : 1;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
