/* 
Write a program that asks for a number from the user, then says whether the number is prime or not.
Remember that a prime number is a positive number (i.e., it is greater than 0) that is divisible only by
1 and itself. You can use the modulo operator (if a % b is zero, then a is divisible by b).
*/

public class Exercises_d1_4 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Please provide a number");
        int num = scan.nextInt();
        int divisor = 1;
        boolean prime = true;
        if (num > 0) {
            while (num > divisor) {
                if (divisor == 1) {
                } else if (num % divisor == 0) {
                    prime = false;
                    break;
                }
            divisor = divisor + 1;
            }
        } else {
            prime = false;
        }

        if (prime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}