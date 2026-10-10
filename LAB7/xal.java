public class xal {
    public static void main(String[] args) {
        int n = 10;
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (n - i - 1) == j) {
                    a[i][j] = 0;
                } else {
                    a[i][j] = 1;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}