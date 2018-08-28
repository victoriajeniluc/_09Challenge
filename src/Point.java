/**
 * Question 1:
 * A 2-dimensional point represents a location in (x,y) co-ordinate space.
 *
 * Create a Point class, which will have two fields of int type: x and y.
 * User should be able to create Point instances in following ways:
 * a) Pass x and y co-ordinate values at the time of initialization.
 * b) If x and y values are not passed, then both x and y should be 0.
 *
 * Provide the printPoint() method, which should print "Point: (x, y)" on to the console, x and y should get replaced by values at runtime.
 *
 * @author Udayan Khattry
 */

public class Point {
    public int x;
    public int y;

    public Point() {

    }

    public Point(int xFromUser, int yFromUser) {
        x = xFromUser;
        y = yFromUser;
    }

    public void printPoint() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}
