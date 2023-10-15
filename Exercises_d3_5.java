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

        point1.x = 1;
        point1.y = 11;

        point2.x = 2;
        point2.y = 22;

        point3.x = 3;
        point3.y = 33;

        System.out.println(point1.x + " " + point1.y + " " + point2.x + " " + point2.y + " " + point3.x + " " + point3.y);
        

        
    }
}
