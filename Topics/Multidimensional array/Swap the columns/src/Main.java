import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j == x) {
                    System.out.print(matrix[i][y] + " ");
                }
                else if (j == y) {
                    System.out.print(matrix[i][x] + " ");
                }
                else System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}