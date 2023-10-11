/*
Write a program that requests two positive numbers from the user and then outputs the quotient and
the remainder, e.g., if the user enters 7 and 3, your program should output something like "7 divided
by 3 is 2, remainder 1". You cannot use the "/" or "%" operators.
*/
public class Exercises_d1_6 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Please provide a positive number: ");
        int num1 = scan.nextInt();
        System.out.print("Please provide a second positive number: ");
        int num2 = scan.nextInt();
        int divisor = num1;
        int counter = 0;
        int remainder = 0;

        while ((divisor - num2) > 0) {
            divisor = divisor - num2;
            counter = counter + 1;
        }
       remainder = num1 - (num2 * counter);
        System.out.println(num1 + " divided by " + num2 + " is " + counter + ", remainder " + remainder);
    }
}