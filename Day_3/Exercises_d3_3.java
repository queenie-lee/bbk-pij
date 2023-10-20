/* 
Write a program that reads two numbers from the user and then offers a menu with the four basic operations: 
addition, subtraction, multiplication, and division. Once the user has selected an operation from the menu, 
the calculator performs the operation.
Hint: In the same way that there exists an Integer.parseInt() method to parse integers, there is also a 
Double.parseDouble() method to parse real numbers. Similarly, class java.util.Scanner has a method nextDouble().
*/

public class Exercises_d3_3 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double num1, num2;
        Double result = null;
        boolean calculation = true;

        System.out.print("Enter your first number: ");
        num1 = scan.nextDouble();
        System.out.print("Enter your second number: ");
        num2 = scan.nextDouble();
        
        while (calculation) {


        System.out.println("Please choose an option:");
        System.out.println("For ’Addition’, please enter '+'");
        System.out.println("For ’Subtraction’, please enter '-'");
        System.out.println("For ’Multiplication’, please enter '*'");
        System.out.println("For ’Division’, please enter '/'");
        String choice = scan.next(); // previously used scan.nextInt(), better to use scan.next()

        switch (choice) {
        
        case "+":
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        calculation = false;
        break;
   
        case "-":
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        calculation = false;
        break;

        case "*":
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        calculation = false;
        break;

        case "/":
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
        calculation = false;
        break;

        default: // invalid option
        System.out.println("That is not a valid option, please try again");
        }


        }

        if (result!=null){
          System.out.println("The result is: " + result);
        }
     }
        
 }
