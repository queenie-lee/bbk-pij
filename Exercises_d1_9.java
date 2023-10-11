/*
Read an arbitrarily long sequence of positive numbers from the user, until -1 is entered. At that point,
print \Yes" if the numbers were consecutive and increasing and \No" otherwise. For example, the
sequences \1,2,3,4,-1" and \5,6,7,8,9,10,11,-1" should lead to the output \Yes", but \2,3,5,6,7,-1",
\10,9,8,7,-1", and \1,1,2,3,4,5,-1" should lead to the output "No".
*/
public class Exercises_d1_9 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int num = 0;
        int lastReadNum = 0;
        boolean positiveNumbersWereRead = true; 
        /* suggestions to replace loop: notFinished, positiveNumbersWereRead -- have really good descriptive names.
        Must be easy for someone else to understand.
        It is fine if the variable is long, as long as it is simple and easy to understand */
        boolean loop = true;

        System.out.print("Checking a positiveNumbersWereRead of numbers... ");

        while (loop) {
        System.out.print("Enter a positive number (enter -1 to exit): ");
        num = scan.nextInt();
        if (num == -1) {
            loop = false;
        } else if (lastReadNum == 0 || lastReadNum + 1 == num) {
            lastReadNum = num;
        } else {
            positiveNumbersWereRead = false;
        }
        }

        if (positiveNumbersWereRead) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
     }

 }