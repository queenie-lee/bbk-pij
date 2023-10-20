/* 
Write a program that reads a series of numbers from the user, until the user enters the String "END".
The program should then print how many numbers were positive, negative, or zero. Write the pro-
gram using (a) if. . . else clauses  1rst and then using (b) the ternary operator. Is there any difference? 
In which case it is easier to write the program? In which case does it look clearer to you?
*/

public class d3_Exercise_D {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        boolean readingNumbers = true;
        int num = 0;
        int positive = 0;
        int negative = 0;
        int zero = 0;

        while (readingNumbers) {
        System.out.print("Please enter a number (enter END to exit): ");
        String word = scan.nextLine();
        if (word == "END") {
            readingNumbers = false;
        } else {
            num = Integer.parseInt(word);
             if (num > 0) {
            positive++;
             } else if (num < 0) {
            negative++;
              } else {
            zero++;
             }
        }
        
        
       
        }
        System.out.println("You have entered " + positive + " positive, " + negative + " negative " + zero + " zero numbers.");
        }
        
    }
