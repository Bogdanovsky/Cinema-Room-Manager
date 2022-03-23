package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int columns = sc.nextInt();
        char[][] plan = new char[rows + 1][columns + 1];

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= columns; j++) {
                plan[i][j] = 'S';
                plan[i][0] = (char) (48 + i);
            }
        }
        plan[0][0] = ' ';
        for (int k = 1; k <= columns; k++) {
            plan[0][k] = (char) (48 + k);
        }
        System.out.println("%n1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
        System.out.println(" ");
        int menuItem = sc.nextInt();
        switch(menuItem) {
            case 1:
                showTheSeats(plan, rows, columns);
                break;
            case 2:
                buyTheTicket(plan, rows, columns);
                break;
            case 3:
                statistics(plan, rows, columns);
                break;
            case 0:
                break;
            
        }
    }    

// SHOW THE SEATS
    public static void showTheSeats(char[][] plan, int rows, int columns) {
        System.out.println("Cinema:");

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= columns; j++) {
                System.out.print(plan[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
        Scanner sc = new Scanner(System.in);
        int menuItem = sc.nextInt();
        switch(menuItem) {
            case 1:
                showTheSeats(plan, rows, columns);
            case 2:
                buyTheTicket(plan, rows, columns);
            case 3:
                statistics(plan, rows, columns);
            case 0:
        }
    }
        
// BUY THE TICKET        
    public static void buyTheTicket(char[][] plan, int rows, int columns) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row number:");
        int seatRow = sc.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seatColumn = sc.nextInt();
        int price = 10;
        
        if (seatRow <= 0 || seatRow > rows || seatColumn <= 0 || seatColumn > columns) {
            System.out.println("Wrong input!");
            buyTheTicket(plan, rows, columns);
        } else if (plan[seatRow][seatColumn] == 'B') {
            System.out.println("That ticket has already been purchased!");
            buyTheTicket(plan, rows, columns);
        } else {
            plan[seatRow][seatColumn] = 'B';
        }

            if(rows * columns > 60 && seatRow > rows / 2) {
                price = 8;
            }

            System.out.println("Ticket price: $" + price);
            System.out.println(" ");
            System.out.println("Cinema:");

            for (int i = 0; i <= rows; i++) {
                for (int j = 0; j <= columns; j++) {
                    System.out.print(plan[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
            int menuItem = sc.nextInt();
            switch(menuItem) {
                case 1:
                showTheSeats(plan, rows, columns);
                case 2:
                buyTheTicket(plan, rows, columns);
                case 0:
            }
    }

//STATISTICS    
    public static void statistics(char[][] plan, int rows, int columns) {
        
        int booked = 0;
        int currInc = 0;
        final int price1 = 10;
        final int price2 = 8;
        int totInc;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < plan[i].length; j ++) {
                if (plan[i][j] == 'B') {
                    booked++;
                    if(rows * columns > 60 && i > rows / 2) {
                        currInc += price2;
                    } else {
                        currInc += price1;
                    }
                }
            }
        }
        
        if(rows * columns <= 60) {
            totInc = rows * columns * price1;     
        } else {
            totInc = rows / 2 * columns * price1 + (rows - rows /2) * columns * price2;
        }
        float percent = 100 * (float) booked / (float) rows / (float) columns;
        
        System.out.println("Number of purchased tickets: " + booked);
        System.out.printf("Percentage: %.2f%%%n", percent);
        System.out.println("Current income: $" + currInc);
        System.out.println("Total income: $" + totInc);
        System.out.println();
        
        System.out.println("1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        int menuItem = sc.nextInt();
        switch(menuItem) {
            case 1:
                showTheSeats(plan, rows, columns);
            case 2:
                buyTheTicket(plan, rows, columns);
            case 3:
                statistics(plan, rows, columns);
            case 0:
        }
        
    }     
        
    
}