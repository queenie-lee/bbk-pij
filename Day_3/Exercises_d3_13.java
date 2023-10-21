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
        boolean checkAmountPaid = true;
        double change = 0;
        boolean changeCounting = true;
        int counting;

        System.out.print("Enter the total amount of your purchase: ");
        total = scan.nextDouble();
        while (checkAmountPaid) {
            System.out.print("Enter the total amount you wish to pay: ");
            amountPaid = scan.nextDouble();
            if (amountPaid <=0 || amountPaid < total) {
                System.out.println("Error, the input is invalid.");
            } else {
                checkAmountPaid = false;
            }
        }

        change = amountPaid - total;

        if (change == 0) {
            System.out.println ("You have paid the exact amount!");
        } else {
            System.out.println("You will receive " + change + " as change, in the form of: ");
            // Specify the number of notes (50, 20, 10, 5) in descending order
            // Specify the number of coins (2, 1, 0.5, 0.2, 0.1, 0.02, 0.01) in descending order

            while (changeCounting) {
                if (change > 50) {
                    counting = (int) (change / 50);
                    System.out.println(counting + " - 50 notes");
                    change = change % 50;
                } else if (change > 20) {
                    counting = (int) (change / 20);
                    System.out.println(counting + " - 20 notes");
                    change = change % 20;
                } else if (change > 10) {
                    counting = (int) (change / 10);
                    System.out.println(counting + " - 10 notes");
                    change = change % 10;
                } else if (change > 5) {
                    counting = (int) (change / 5);
                    System.out.println(counting + " - 5 notes");
                    change = change % 5;
                } else if (change > 2) {
                    counting = (int) (change / 2);
                    System.out.println(counting + " - 2 coin");
                    change = change % 2;
                } else if (change > 1) {
                    counting = (int) (change / 1);
                    System.out.println(counting + " - 1 coin");
                    change = change % 1;
                } else if (change > 0.50) {
                    counting = (int) (change / 0.5);
                    System.out.println(counting + " - 0.5 coin");
                    change = change % 0.5;
                } else if (change > 0.2) {
                    counting = (int) (change / 0.2);
                    System.out.println(counting + " - 0.2 coin");
                    change = change % 0.2;
                } else if (change > 0.1) {
                    counting = (int) (change / 0.1);
                    System.out.println(counting + " - 0.1 coin");
                    change = change % 0.1;
                } else if (change > 0.05) {
                    counting = (int) (change / 0.05);
                    System.out.println(counting + " - 0.05 coin");
                    change = change % 0.05;
                } else if (change > 0.01) {
                    counting = (int) (change / 0.01);
                    System.out.println(counting + " - 0.01 coin");
                    change = change % 0.01;
                } else {
                    changeCounting = false;
                }
            }
        }


    }
}