/*
Write a program that reads some text from the user and then says how many letters 'e' are there in
that text.
Then modify the program so that it reads the text from the user and then asks for a letter. The pro-
gram should then say how many times you can  nd the letter in the text.
*/

public class Exercises_d3_10 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        //char letter = 'e';
        int letterCounter = 0;
        int counter = 0;

        System.out.print("Enter some text: ");
        String text = scan.nextLine();

        System.out.print("Enter the letter you wish to count: ");
        String letter = scan.nextLine();
        char l = letter.charAt(0);

        while (counter < text.length()) {
            if (text.charAt(counter) == l) {
                letterCounter ++;
            }
            counter ++;
        }

        System.out.print("There are " + letterCounter + " \'" + l + "\'s in your text");
    }
}