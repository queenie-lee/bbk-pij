/*
Read an arbitrarily long sequence of positive numbers from the user, until -1 is entered. At that point,
print \Yes" if the numbers were consecutive and increasing and \No" otherwise. For example, the
sequences \1,2,3,4,-1" and \5,6,7,8,9,10,11,-1" should lead to the output \Yes", but \2,3,5,6,7,-1",
\10,9,8,7,-1", and \1,1,2,3,4,5,-1" should lead to the output "No".

Modify your program from the previous exercise so that it outputs \Yes" when the numbers are consecutive, 
regardless of whether they go up or down. For example, both \2,3,4,5,6,-1" and \10,9,8,7,-1" should now 
result in \Yes".
*/
public class Exercises_d1_10 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int num = 0;
        int compare = 0;
        boolean sequence = true;
        boolean loop = true;

        System.out.print("Checking a sequence of numbers... ");
        
        System.out.print("Enter a positive number (enter -1 to exit): ");
        num = scan.nextInt();
        compare = num;

        while (loop) {
        System.out.print("Enter a positive number (enter -1 to exit): ");
        num = scan.nextInt();
        if (num == -1) {
            loop = false;
        } else if ((compare +1 == num) || (compare -1 == num)) { 
            compare = num;
        } else {
            sequence = false;
        }
        }

        if (sequence) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
     }

 }