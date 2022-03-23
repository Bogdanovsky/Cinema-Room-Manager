import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        int b = 1;
        while (a * a <= n) {
            a++;
        }
        do {
            System.out.println(b * b);
            b++;
        } while (b < a);
    }
}
