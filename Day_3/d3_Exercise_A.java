/* 
Write a program like the one in the last example, but add a little code for each case (some System.out.println
statements will do) and remove the break keywords. Execute the program and see what happens.
*/

public class d3_Exercise_A {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Please choose an option:");
        System.out.println("For ’Checking your balance’, please enter 1");
        System.out.println("For ’Purchases’, please enter 2");
        System.out.println("For ’Refunds’, please enter 3");
        System.out.println("For ’Queries about the warranty’, please enter 4");
        System.out.println("For ’Returning faulty goods’, please enter 5");
        System.out.println("For any other query, please enter 0");
        int choice = scan.nextInt();

        switch (choice) {
        case 1:
        // go and check balance
        System.out.println("Your balance is £50.");
        break;
   
        case 2:
        // go and purchase something
        System.out.println("There are 10 widgets in stock for £10 each.");
        break;

        case 3:
        // go and process refunds
        System.out.println("Refunds can be made within 30 days of purchase.");
        break;

        case 4:
        // go and answer queries
        System.out.println("Warranties are offered within 1 year of purchase date");
        break;

        case 5:
        // return faulty goods
        System.out.println("Faulty goods are covered under warranty and can be returned within 1 year of purchase date.");
        break;

        default:
        // go and talk with a human operator
        System.out.println("Please stay on the line for the next representative...");

        }
    }
}