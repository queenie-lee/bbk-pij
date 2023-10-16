/*Write a program that reads some text from the user and then writes the same text on screen, but
each letter on a different line.
Now modify your program to write each word (as defined by spaces) rather than letter on a different
line.
*/

public class Exercises_d3_9 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        boolean textOutput = true;
        int counter = 0;

        System.out.print("Enter some text: ");
        String word = scan.nextLine();

        while (counter < word.length()) {
            System.out.println(word.charAt(counter));
            counter++;
        }

    }
}