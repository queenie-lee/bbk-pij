/* 
Write a program that reads the X and Y coordinates of three points and then outputs which two of
the three are closest to each other. Use the following class to store the data for the points:
class Point {
double x;
double y;
}

Hint: The distance from (x1, y1) to (x2, y2) can be calculated as
p
(x1 􀀀 x2)2 + (y1 􀀀 y2)2
Hint: The method Math.sqrt() takes a value of type double and returns its square root.

*/

class Point {
    double x;
    double y;
}
public class Exercises_d3_5 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        Point point1 = new Point();
        Point point2 = new Point();
        Point point3 = new Point();

        System.out.print("Enter the first point's x coordinate: ");
        point1.x = scan.nextDouble();
        System.out.print("Enter the first point's y coordinate: ");
        point1.y = scan.nextDouble();

        System.out.print("Enter the second point's x coordinate: ");
        point2.x = scan.nextDouble();
        System.out.print("Enter the second point's y coordinate: ");
        point2.y = scan.nextDouble();

        System.out.print("Enter the third point's x coordinate: ");
        point3.x = scan.nextDouble();
        System.out.print("Enter the third point's y coordinate: ");
        point3.y = scan.nextDouble();

        double distance12 = Math.sqrt(Math.pow((point1.x - point2.x),2) + Math.pow((point1.y - point2.y),2));
        double distance23 = Math.sqrt(Math.pow((point2.x - point3.x),2) + Math.pow((point2.y - point3.y),2));
        double distance31 = Math.sqrt(Math.pow((point3.x - point1.x),2) + Math.pow((point3.y - point1.y),2));

        /* System.out.println(distance12 + " " + distance23 + " " + distance31); */

        if (distance12 < distance23 && distance12 < distance31) {
            System.out.println("Coordinates (" + point1.x + "," + point1.y + ") and (" + point2.x + "," + point2.y + ") are closest to each other.");
        } else if (distance23 < distance12 && distance23 < distance31) {
            System.out.println("Coordinates (" + point2.x + "," + point2.y + ") and (" + point3.x + "," + point3.y + ") are closest to each other.");
        } else if (distance31 < distance12 && distance31 < distance23) {
            System.out.println("Coordinates (" + point3.x + "," + point3.y + ") and (" + point1.x + "," + point1.y + ") are closest to each other.");
        } else {
            System.out.println("At least two of these coordinates are equally close to each other.");
        }
        
    }
}
