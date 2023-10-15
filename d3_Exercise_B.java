/* 
Write a program similar to the one in the former example, but a bit better. Make the computer ask
for an option and then execute the corresponding code in a switch . . . case structure. If the user in-
troduces an invalid option (e.g., 9 in the example above), make the computer say \That is not a valid
option, please try again", and ask again until the user enters a valid numbers. Hint: You will need to
use a loop and change the default case.
*/

public class d3_Exercise_B {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        boolean programOptions = true;

        while (programOptions) {
        System.out.println("Please choose an option:");
        System.out.println("For ’Checking your balance’, please enter 1");
        System.out.println("For ’Purchases’, please enter 2");
        System.out.println("For ’Refunds’, please enter 3");
        System.out.println("For ’Queries about the warranty’, please enter 4");
        System.out.println("For ’Returning faulty goods’, please enter 5");
        System.out.println("For any other query, please enter 0");
        int choice = scan.nextInt();

        switch (choice) {
        
        case 0:
        // go and talk with a human operator
        System.out.println("Please stay on the line for the next representative...");
        programOptions = false;
        break;
        
        case 1:
        // go and check balance
        System.out.println("Your balance is £50.");
        programOptions = false;
        break;
   
        case 2:
        // go and purchase something
        System.out.println("There are 10 widgets in stock for £10 each.");
        programOptions = false;
        break;

        case 3:
        // go and process refunds
        System.out.println("Refunds can be made within 30 days of purchase.");
        programOptions = false;
        break;

        case 4:
        // go and answer queries
        System.out.println("Warranties are offered within 1 year of purchase date");
        programOptions = false;
        break;

        case 5:
        // return faulty goods
        System.out.println("Faulty goods are covered under warranty and can be returned within 1 year of purchase date.");
        programOptions = false;
        break;

        default:
        // invalid option
        System.out.println("That is not a valid option, please try again");

        }
        }
        
    }
}