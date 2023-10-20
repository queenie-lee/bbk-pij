/*
Write a program that requests two numbers from the user and then outputs their product. You can-
not use the \*" operator.
Can you make your program work correctly also if one or both numbers are negative?
*/
public class Exercises_d1_5 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Please provide a number: ");
        int num1 = scan.nextInt();
        System.out.print("Please provide a second number: ");
        int num2 = scan.nextInt();
        int counter = 0;
        int product = 0;
        int sign = 1;
        
        if (num1 < 0){
            num1 = num1 * (-1);
            sign = sign * (-1);
            if (num2 < 0){
                num2 = num2 * (-1);
                sign = sign * (-1);
            }
        } else if (num2 < 0){
            num2 = num2 * (-1);
            sign = sign * (-1);
        }
        while (counter < num2) {
            product = product + num1;
            counter = counter + 1;
        }
        product = product * sign;
        System.out.println("The product is: " + product);
    }
}