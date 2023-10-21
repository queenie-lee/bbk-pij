/*
Write a program that reads the coordinates of the two points defining a rectangle and then the
coordinates of a third point. The program must then determine whether the point falls inside or outside
the rectangle.
 */
public class Week3_7 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        Rectangle myRectangle = new Rectangle();

        Point upLeft = new Point();
        System.out.print("Enter the rectangle's upper left point x coordinate: ");
        upLeft.x = scan.nextDouble();
        System.out.print("Enter the rectangle's upper left point y coordinate: ");
        upLeft.y = scan.nextDouble();

        myRectangle.upLeft = upLeft;

        Point downRight = new Point();
        System.out.print("Enter the rectangle's lower right point x coordinate: ");
        downRight.x = scan.nextDouble();
        System.out.print("Enter the rectangle's lower right point y coordinate: ");
        downRight.y = scan.nextDouble();

        myRectangle.downRight = downRight;

        Point thirdPoint = new Point();
        System.out.print("Enter the third point's x coordinate: ");
        thirdPoint.x = scan.nextDouble();
        System.out.print("Enter the third point's y coordinate: ");
        thirdPoint.y = scan.nextDouble();

        // to test code
        /*
        Point downRight = new Point();
        downRight.x = 30;
        downRight.y = 5;

        Point upLeft = new Point();
        upLeft.x = 2;
        upLeft.y = 40;

        myRectangle.downRight = downRight;
        myRectangle.upLeft = upLeft;

        Point thirdPoint = new Point();
        thirdPoint.x = 1;
        thirdPoint.y = 10;
        */


        // The program must then determine whether the point falls inside or outside the rectangle.
        if ((myRectangle.upLeft.x < thirdPoint.x) && (thirdPoint.x < myRectangle.downRight.x) && (myRectangle.downRight.y < thirdPoint.y ) && (thirdPoint.y < myRectangle.upLeft.y)) {
            System.out.println("The third point (" + thirdPoint.x + "," + thirdPoint.y + ") falls inside the rectangle.");
        } else {
            System.out.println("The third point (" + thirdPoint.x + "," + thirdPoint.y + ") falls outside the rectangle.");
        }


    }
}
