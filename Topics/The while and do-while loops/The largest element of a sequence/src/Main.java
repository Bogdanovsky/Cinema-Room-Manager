import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pin = scanner.nextInt();
        int max = 0;
        do {
            if (pin > max) {
                max = pin;
            }
            pin = scanner.nextInt();
        } while (pin != 0);
        System.out.print(max);
    }
}
