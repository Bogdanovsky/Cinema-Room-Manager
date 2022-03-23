import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        double percent = scanner.nextDouble();
        double key = scanner.nextDouble();

        double n = 0;
        while (key > money * Math.pow(1 + percent / 100, n)) {
            n++;
        }

        int k = (int) Math.round(n);
        System.out.println(k);
    }
}
