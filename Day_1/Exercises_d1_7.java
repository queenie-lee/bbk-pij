/*
Write a program that reads three numbers and prints them in order, from lowest to highest.
*/
public class Exercises_d1_7 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Please provide a number: ");
        int a = scan.nextInt();
        System.out.print("Please provide a second number: ");
        int b = scan.nextInt();
        System.out.print("Please provide a third number: ");
        int c = scan.nextInt();
        
        int compare = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

/* Code suggested by lecture

        if (num1 > num2 && num1 > num3){
            if(num2 > num3) {
                System.out.println(num3 + " " + num2 + " " + num1);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println(num3 + " " + num1 + " " + num2)
            } else {
                System.out.println(num1 + " " + num3 + " " + num2)
            }
        } else {
             if (num1 > num2) {
                System.out.println(num3 + " " + num2 + " " + num1)
            } else {
                System.out.println(num3 + " " + num1 + " " + num2)
            }
        } 
*/
        if (a < b) {
            if (a < c) {
                num1 = a;
                if (b < c) {
                    num2 = b;
                    num3 = c;
                } else if (b > c) {
                    num2 = c;
                    num3 = b;
                }
            } else if (a > c) {
                num1 = c;
                if (a < b) {
                    num2 = a;
                    num3 = b;
                } else if (a > b) {
                    num2 = b;
                    num3 = a;
                }
            }
        } else if (a > b) {
            if (b < c) {
                num1 = b;
                if (a < c) {
                    num2 = a;
                    num3 = c;
                } else if (a > c) {
                    num2 = c;
                    num3 = a;
                }
            } else if (b > c) {
                num1 = c;
                if (a < b) {
                    num2 = a;
                    num3 = b;
                } else if (a > b) {
                    num2 = b;
                    num3 = a;
                }
            }
            }
        System.out.println("The three numbers in order from lowest to highest are : " + num1 + ", " + num2 + ", " + num3 );
     }

 }