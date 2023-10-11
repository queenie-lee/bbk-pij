/*
Write a program that reads a (arbitrarily long) sequence of positive numbers. The sequence is ended
when the users enters "-1". At that point, the program must output the highest number in the sequence.
*/
public class Exercises_d1_8 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int num = 0;
        int largest = 0;
        boolean loop = true;

        while (loop) {
        System.out.print("Enter a number (enter -1 to exit): ");
        num = scan.nextInt();
        if (num == -1) {
            loop = false;
        } else if (largest == 0 || num > largest) { 
            largest = num;
        }
        }

        System.out.println("The larger number entered is: " + largest );
     }

 }