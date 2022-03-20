package com.rodrigotroy.learning_java.scanner;

import java.util.Scanner;

public class Cinema {

    private static void butTicket(Scanner scanner,
                                  char[][] seatsArray) {
        boolean inputOK = false;
        int row = 0;
        int seat;

        while (!inputOK) {
            System.out.println("\nEnter a row number:");
            row = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            seat = scanner.nextInt();

            if (seatIsAvailable(seatsArray,
                                row,
                                seat)) {
                reserveSeat(seatsArray,
                            row,
                            seat);

                inputOK = true;
            }
        }

        printTicketPrice(seatsArray,
                         row);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        char[][] seatsArray = getSeatsArray(rows,
                                            seats);
        printCinema(seatsArray);

        while (true) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");

            int option = scanner.nextInt();

            if (option == 1) {
                printCinema(seatsArray);
            } else if (option == 2) {
                butTicket(scanner,
                          seatsArray);
            } else if (option == 3) {
                printStatistics(seatsArray);
            } else if (option == 0) {
                return;
            }
        }


        /*System.out.println("Total income:");
        int profit = calculateProfit(rows,
                                     seats);
        System.out.printf("$%d",
                          profit);*/
    }

    private static void printStatistics(char[][] seatsArray) {
        int totalSeats = seatsArray.length * seatsArray[0].length;
        int purchasedTickets = 0;
        int currentIncome = 0;

        for (int row = 0; row < seatsArray.length; row++) {
            for (int seat = 0; seat < seatsArray[row].length; seat++) {

                if (seatsArray[row][seat] == 'B') {
                    purchasedTickets++;

                    currentIncome += getTicketPrice(seatsArray,
                                                    row + 1);
                }
            }
        }

        double percentage = (double) purchasedTickets / totalSeats;

        System.out.printf("Number of purchased tickets: %d\n",
                          purchasedTickets);
        System.out.printf("Percentage: %.2f%%\n",
                          percentage * 100);
        System.out.printf("Current income: $%d\n",
                          currentIncome);
        System.out.printf("Total income: $%d\n\n",
                          getTotalIncome(seatsArray.length,
                                         seatsArray[0].length));
    }

    private static char[][] getSeatsArray(int rows,
                                          int seats) {
        char[][] seatsArray = new char[rows][seats];

        for (int r = 0; r < rows; r++) {
            for (int s = 0; s < seats; s++) {
                seatsArray[r][s] = 'S';
            }
        }

        return seatsArray;
    }

    private static boolean seatIsAvailable(char[][] seatsArray,
                                           int row,
                                           int seat) {
        if (row > seatsArray.length || seat > seatsArray[0].length) {
            System.out.println("Wrong input!");
            return false;
        }

        boolean isAvailable = seatsArray[row - 1][seat - 1] != 'B';

        if (!isAvailable) {
            System.out.println("That ticket has already been purchased!");
        }

        return isAvailable;
    }

    private static void reserveSeat(char[][] seatsArray,
                                    int row,
                                    int seat) {
        seatsArray[row - 1][seat - 1] = 'B';
    }

    private static void printTicketPrice(char[][] seatsArray,
                                         int rows) {
        System.out.printf("Ticket price: $%d\n",
                          getTicketPrice(seatsArray,
                                         rows));
    }

    private static void printCinema(char[][] seatsArray) {
        System.out.print("\nCinema:\n ");

        for (int i = 1; i <= seatsArray[0].length; i++) {
            System.out.printf(" %d",
                              i);
        }

        System.out.println("");

        for (int r = 0; r < seatsArray.length; r++) {
            System.out.printf("%d",
                              r + 1);

            for (int s = 0; s < seatsArray[0].length; s++) {
                System.out.printf(" %c",
                                  seatsArray[r][s]);
            }

            System.out.println("");
        }
    }

    private static int getTotalIncome(int rows,
                                      int seats) {
        int total = seats * rows;

        if (total <= 60) {
            return total * 10;
        } else {
            int firstHalf = rows / 2;
            int secondHalf = rows - firstHalf;

            return firstHalf * seats * 10 + secondHalf * seats * 8;
        }
    }

    private static int getTicketPrice(char[][] seatsArray,
                                      int row) {
        int rows = seatsArray.length;
        int seats = seatsArray[0].length;
        int total = rows * seats;

        if (total <= 60) {
            return 10;
        } else {
            int firstHalf = rows / 2;

            return row <= firstHalf ? 10 : 8;
        }
    }
}
