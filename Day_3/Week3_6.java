/*
Write a program that reads the X and Y coordinates of two points and then outputs the area of a
rectangle where both points are opposite corners. Use the following class to store the data for the
points:
class Rectangle {
    Point upLeft;
    Point downRight;
}
Your program should calculate (and write on the screen) the perimeter and area of the rectangle.
Note: For Exercises 6, 7, and 8 you must access (i.e., read or write) the value of the coordinates of
the points through the rectangle, not directly through the point, i.e., myRectangle.upLeft.x, not
point.x or x.
*/

public class Week3_6 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        Rectangle myRectangle = new Rectangle();
        //Point myRectangle.upLeft = new Point(); /* Fix this! */
        Point upLeft = new Point();
        System.out.print("Enter the upper left point's x coordinate: ");
        upLeft.x = scan.nextDouble();
        System.out.print("Enter the upper left point's y coordinate: ");
        upLeft.y = scan.nextDouble();

        Point downRight = new Point();
        System.out.print("Enter the lower right point's x coordinate: ");
        downRight.x = scan.nextDouble();
        System.out.print("Enter the lower right point's y coordinate: ");
        downRight.y = scan.nextDouble();

        /* to test code

        Point downRight = new Point();
        downRight.x = 30;
        downRight.y = 5;

        Point upLeft = new Point();
        upLeft.x = 2;
        upLeft.y = 40;
        */

        myRectangle.downRight = downRight;
        myRectangle.upLeft = upLeft;

        // Your program should calculate (and write on the screen) the perimeter and area of the rectangle.
        // x
        double width = myRectangle.downRight.x - myRectangle.upLeft.x;
        double height = myRectangle.upLeft.y - myRectangle.downRight.y;

        System.out.println("The perimeter of your rectangle is: " + (width + height) * 2);
        System.out.println("The area of your rectangle is: " + (width * height));

        //System.out.println(myRectangle.upLeft.x + myRectangle.upLeft.y + myRectangle.downRight.x + myRectangle.downRight.y);


    }
}