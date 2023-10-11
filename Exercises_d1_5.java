public class Exercises_d1_5 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Please provide a number: ");
        int num1 = scan.nextInt();
        System.out.print("Please provide a second number: ");
        int num2 = scan.nextInt();
        int counter = 0;
        int product = 0;
        boolean prime = true;
        while (counter < num2) {
            product = product + num1;
            counter = counter + 1;
        }
        System.out.println("The product is: " + product);
    }
}