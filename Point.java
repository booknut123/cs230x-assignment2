
/**
 * Defines a class, named Point, to represent a point on the Cartesian plane, making use of the point's x and y coordinates, both of type double.
 *
 * @author Kailyn Lau + CS230 Staff (SK)
 * @version v1.1
 */
public class Point
{
    private final double TOLERANCE = 0.01;
    private double x;
    private double y;

    /**
     * Creates a Point at location (0.0, 0.0).
     */
    public Point() {
        new Point(0.0, 0.0);
    }

    /**
     * Given two doubles, it creates a Point.
     * 
     * @param xCoord The x-coordinate of the point
     * @param yCoord The y-coordinate of the point
     */
    public Point​(double xCoord, double yCoord) {
        x = xCoord;
        y = yCoord;
    }

    /**
     * Returns the x-coordinate of this point.
     * 
     * @return The x-coordinate of this point
     */
    public double getX() {
        return x;
    }

    /**
     * Sets the x-coordinate of this point.
     * 
     * @param newX The new x-coordinate of this point
     */
    public void setX (double newX) {
        x = newX;
    }

    /**
     * Returns the y-coordinate of this point.
     * 
     * @return The y-coordinate of this point
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the y-coordinate of this point.
     * 
     * @param newY The new y-coordinate of this point
     */
    public void setY (double newY) {
        y = newY;
    }

    /**
     * Finds and returns the distance between this (the invoking) point and the input one.
     * 
     * @param other The other point
     * @return      The distance between this point and the inputted one
     */
    public double findDistance (Point other) {
        return Math.sqrt(Math.pow(other.getX() - getX(), 2) + Math.pow(other.getY() - getY(), 2));
    }

    /**
     * Checks whether this point is at equal distance from the two inputted points.
     * Returns true if the two points are practically equidistant, i.e. their distance is less than TOLERANCE, false otherwise.
     * 
     * @param p2 The second point
     * @param p3 The third point
     * @return   true if the second point and the third point have practically the same distance from this point
     */
    public boolean areEquidistant (Point p2, Point p3) {
        return Math.abs(findDistance(p2) - findDistance(p3)) < TOLERANCE;
    }

    /**
     * Provides a string representation of a Point
     * 
     * @return (x, y)
     */
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Driver method, used to test the class.
     */
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point();

        System.out.println("Expected x-coord: 0.0 | Computed x-coord: " + p2.getX());
        p2.setX(5.0);
        System.out.println("Expected new x-coord: 5.0 | Computed x-coord: " + p2.getX());
        System.out.println("Expected y-coord: 0.0 | Computed y-coord: " + p2.getY());
        p2.setY(5.0);
        System.out.println("Expected new y-coord: 5.0 | Computed y-coord: " + p2.getY());

        System.out.println("Expected distance between " + p1 + " and " + p2 + ": 5.0 | Computed distance: " + p1.findDistance(p2));
        System.out.println("(4, 5) and (6, 5) are equidistant to " + p2 + ": expected true | computed " + p2.areEquidistant(new Point (4,5), new Point (6,5)));

        // testing negatives
        p1 = new Point(-1, -2);
        p2 = new Point(-3, -4);
        System.out.println("Expected distance between " + p1 + " and " + p2 + ": 2.828... | Computed distance: " + p1.findDistance(p2));

        // testing 0
        p1 = new Point(1, 1);
        p2 = new Point(1, 1);
        System.out.println("Expected distance between " + p1 + " and " + p2 + ": 0.0 | Computed distance: " + p1.findDistance(p2));
    }
}
