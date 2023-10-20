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
        String word = "";
        char space = ' ';

        System.out.print("Enter some text: ");
        String text = scan.nextLine();

        while (counter <= text.length()) {
            if (counter == text.length() ) {
                System.out.println(word);
            } else if (text.charAt(counter) != space) {
                word += text.charAt(counter);
            } else {
                System.out.println(word);
                word = "";
            }
            counter++;
        }

        // code to write the prompted text on screen, with each letter on a different line
        /*
        while (counter < text.length()) {
            System.out.println(text.charAt(counter));
            counter++;
        }
        */

    }
}