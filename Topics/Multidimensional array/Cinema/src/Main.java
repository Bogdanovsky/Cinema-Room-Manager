import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] cinema = new int[rows][columns];
        int freeSeats = 0;
        boolean available = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                cinema[i][j] = sc.nextInt();
            }
        }

        int seats = sc.nextInt();
        sc.close();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (cinema[i][j] == 0) {
                    freeSeats++;
                    if (freeSeats == seats) {
                        System.out.print(i + 1);
                        available = true;
                        break;  
                    }
                }
                else {
                    freeSeats = 0;
                }
            }
            freeSeats = 0;
            if (available) {
                break;
            }
        }
        if (!available) {
            System.out.println(0);
        }
    }
}
