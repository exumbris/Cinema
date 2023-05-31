package cinema;
import java.util.Arrays;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = scanner.nextInt();

        int totalNumSeats = seatsPerRow * numRows;

        // Build the initial cinema display; no one has bought a ticket yet
        String[][] cinema = new String[numRows][seatsPerRow];
        for (int i = 0; i < numRows; i++) {
            Arrays.fill(cinema[i], "S");
        }

        boolean flag = true;
        while (flag) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    flag = false;
                case 1:
                    showSeats(seatsPerRow, numRows, cinema);
                    break;
                case 2:
                    buyTicket(totalNumSeats, numRows, seatsPerRow, cinema);
                    break;
                case 3:
                    stats(seatsPerRow, numRows, totalNumSeats, cinema);
                    break;
            }

        }
    }


    //This is for buying a ticket(s)
    public static void buyTicket(int totalNumSeats, int numRows, int seatsPerRow, String[][] cinema) {
        //These two below will serve as coordinates to the seat
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int ticketPrice = 0;
        int front = 0;
        int rowNum = 0;
        int seatNumber = 0;
        
        while(flag) {
            System.out.println("Enter a row number:");
            rowNum = scanner.nextInt();
            
            System.out.println("Enter a seat number in that row:");
            seatNumber = scanner.nextInt();
            
            if(rowNum > numRows || rowNum <= 0 || seatNumber > seatsPerRow || seatNumber <= 0) {
                System.out.println("Wrong input!");
                continue;
            }
            
            if(cinema[rowNum - 1][seatNumber - 1].equals("B")) {
                System.out.println("That ticket has already been purchased");
                continue;
            }
            front = numRows / 2;
            if(totalNumSeats <= 60) {
                ticketPrice = 10;
            }
            else {
                if(rowNum <= front) {
                    ticketPrice = 10;
                }
                else {
                    ticketPrice = 8;
                }
            }
           
            
            cinema[rowNum - 1][seatNumber - 1] = "B";
            
            System.out.printf("Ticket price: $%d\n", ticketPrice);
            flag = false;
        }
    }


    // This shows the seats
    public static void showSeats(int seatsPerRow, int numRows, String[][] cinema) {
       System.out.println("Cinema:");
        for (int i = 1; i <= seatsPerRow; i ++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < numRows; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < seatsPerRow; j ++) {
                System.out.print(" " + cinema[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void stats(int seatsPerRow,int numRows, int totalNumSeats, String[][] cinema) {
        
        int numPurchasedTickets = 0;
        
        //count the number of purchased seats
        for(int i = 0; i < numRows; i++) {
            for(int j = 0; j < seatsPerRow; j++) {
                if(cinema[i][j].equals("B")) {
                    numPurchasedTickets += 1;
                }
            }
        }
        
        double percentageOfPurchasedSeats = ((double) numPurchasedTickets) / (seatsPerRow * numRows);
        
        int totalIncome = 0;
        int currentIncome = 0;
        int ticketPrice;
        int front = (numRows + 1) / 2;
        if(totalNumSeats <= 60) {
            ticketPrice = 10;
            for(int i = 0; i < numRows; i++) {
                for(int j = 0; j < seatsPerRow; j++) {
                    totalIncome += 10;
                    if(cinema[i][j].equals("B")) {
                        currentIncome += 10;
                    }
                }
            }
        }
        else {
            for(int i = 0; i < numRows; i++) {
                for(int j = 0; j < seatsPerRow; j++) {
                    if(i < front - 1) {
                        totalIncome += 10;
                        if(cinema[i][j].equals("B")) {
                            currentIncome += 10;
                        }
                    }
                    else {
                        totalIncome += 8;
                        if(cinema[i][j].equals("B")) {
                            currentIncome += 8;
                        }
                    }
                }
            }
        
        
        
        /*
                if (totalNumSeats <= 60) {
                ticketPrice = 10;
            } else {
                front = numRows / 2;
                if (rowNum <= front) {
                    ticketPrice = 10;
                } else {
                ticketPrice = 8;
                }
            }
        
         */
            
            System.out.printf("Number of purchased tickets: %d\n", numPurchasedTickets);
            System.out.printf("Percentage: %.2f%%\n", percentageOfPurchasedSeats * 100);
            System.out.printf("Current income: $%d\n", currentIncome);
            System.out.printf("Total income: $%d\n", totalIncome);
            
        }
        
    }

}