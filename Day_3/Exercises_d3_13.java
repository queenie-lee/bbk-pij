/*
Write a program that reads the total cost of a purchase and an amount of money that is paid to buy
it. Your program should output the correct change specifying the amount of notes (50, 20, 10, 5) and
coins (2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01) needed.
*/

public class Exercises_d3_13 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double total = 0;
        double amountPaid = 0;
        double difference = 0;
        double change = 0;

        System.out.print("Enter the total amount of your purchase: ");
        total = scan.nextDouble();
        System.out.print("Enter the total amount you wish to pay: ");
        amountPaid = scan.nextDouble();

        change = total - amountPaid;

        System.out.println("You will receive " + change + " in the form of: ");
        // Specify the number of notes (50, 20, 10, 5) in descending order
        // Specify the number of coins (1, 1, 0.5, 0.2, 0.1, 0.02, 0.01) in descending order

        if (change > 50) {
            System.out.println( change / 50 "You will receive " + change + " in the form of: ");
            change % 50 
        }
    }
}