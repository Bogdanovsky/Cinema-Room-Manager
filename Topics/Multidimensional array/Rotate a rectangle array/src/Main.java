import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int l = 0; l < m; l++) {
            for (int k = n - 1; k >= 0; k--) {
                System.out.print(array[k][l] + " ");
            }
            System.out.println();
        }


    }
}
