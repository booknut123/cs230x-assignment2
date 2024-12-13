import java.util.Scanner;
/**
 * Implements a class named Flight that represents an airline flight. It contains instance data that represent the name of the airline, the flight number, the flights origin and destination cities. A static method readFlight() is used to get values from the keyboard.
 * In addition to the getters and setters, the class provides a String representation of Flight object.
 * The main shows the use of a driver/testing program
 *
 * @author Kailyn Lau + CS230 Staff
 * @version v1.1
 */
public class Flight
{
    private String airlineName;
    private int flightNum;
    private String origin;
    private String destination;
    
    /**
     * Creates Flight objects, given their characteristics.
     * 
     * @param airline the name of the airline
     * @param flNum   the flight number
     * @param from    the city of origin
     * @param to      the city of destination
     */
    public Flight(String airline, int flNum, String from, String to) {
        airlineName = airline;
        flightNum = flNum;
        origin = from;
        destination = to;
    }

    /**
     * Returns this flight's airline
     * 
     * @return the airline name
     */
    public String getAirline() {
        return airlineName;
    }

    /**
     * Sets this flight's airline
     * 
     * @param airline the updated name of the airline for this flight
     */
    public void setAirline (String airline) {
        airlineName = airline;
    }

    /**
     * Getter for flightNum of this flight
     * 
     * @return the flight number
     */
    public int getFlightNumber() {
        return flightNum;
    }

    /**
     * Setter for flightNum of this flight
     * 
     * @param flNum the number for this flight
     */
    public void setFlightNumber(int flNum) {
        flightNum = flNum;
    }

    /**
     * Returns the origin of this flight
     * 
     * @return the origin city of the flight
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the origin of this flight to the input one
     * 
     * @param fromCity the origin city of the flight
     */
    public void setOrigin(String fromCity) {
        origin = fromCity;
    }

    /**
     * Gets the destination of this flight
     * 
     * @return the destination city of this flight
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the destination of this flight
     * 
     * @return toCity the destination city of this flight
     */
    public void setDestination(String toCity) {
        destination = toCity;
    }

    /**
     * Checks whether the destination of this flight is the same as origin of the input one.
     * 
     * @param f the flight to check its origin
     * @return  if this flight's destination is the same as the origin of the input flight
     */
    public boolean isAStopOver(Flight f) {
        return getDestination().equals(f.getOrigin());
    }

    /**
     * Checks whether the invoking flight and the input one are alternatives, i.e. they have the same origin and the same destination.
     * 
     * @param f the flight to check its origin and destination for being equal to the ones of the invoking flight
     * @return  true if this flight's origin and destination are the same as the ones in the input flight
     */
    public boolean isAnAlternative(Flight other) {
        return getOrigin().equals(other.getOrigin()) && getDestination().equals(other.getDestination());
    }

    /**
     * Returns a String representation of this flight
     * 
     * @return the state of this flight, as a string
     */
    public String toString() {
        return airlineName + flightNum + " from " + origin + " to " + destination;
    }

    /**
     * Reads from the keyboard the properties of a Flight. Returns the Flight object. Used in main(). Notice that this is a "static" method, because it is to be used by the static main().
     * 
     * @param s the Scanner object to be used for reading user input
     * @return  the flight as entered by the user
     */
    public static Flight readFlight (Scanner s) {
        System.out.print("Airline name: ");
        String airline = s.nextLine();
        System.out.print("Flight number: ");
        int flNum = s.nextInt();
        s.nextLine();
        System.out.print("Origin: ");
        String from = s.nextLine();
        System.out.print("Destination: ");
        String to = s.nextLine();
        s.close();
        return new Flight(airline, flNum, from, to);
    }

    /**
     * Driver, used to test this class.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Testing manual entry: ");
        Flight f1 = readFlight(scan);
        System.out.println("New Flight f1 entered: " + f1);
        
        System.out.println("\nTesting constructor: ");
        Flight f2 = new Flight("DL", 55, "LAX", "SFO");
        Flight f3 = new Flight("OA", 1234, "SFO", "ATH");
        System.out.println("New Flight f2 created: " + f2);
        System.out.println("New Flight f3 created: " + f3);
        
        System.out.println("\nExpected getAirline(f1): AA | Computed: " + f1.getAirline());
        System.out.println("Expected getFlightNumber(f1): 123 | Computed: " + f1.getFlightNumber());
        System.out.println("Expected getOrigin(f1): BOS | Computed: " + f1.getOrigin());
        System.out.println("Expected getDestination(f1): LAX | Computed: " + f1.getDestination());
        
        System.out.println("\nFlights " + f1 + " and " + f2 + " share stopover city: expected true | Computed: " + f1.isAStopOver(f2));
        System.out.println("Flights " + f2 + " and " + f1 + " share stopover city: expected false | Computed: " + f2.isAStopOver(f1));
        System.out.println("Flights " + f2 + " and " + f3 + " share stopover city: expected true | Computed: " + f2.isAStopOver(f3));
        
        f1.setDestination("BOS");
        f1.setOrigin("SFO");
        System.out.println("\nTesting setDestination(f1): " + f1.getDestination());
        System.out.println("Testing setOrigin(f1): " + f1.getOrigin());
        System.out.println("Confirming changes: " + f1);
        
        System.out.println("\nFlights " + f1 + " and " + f2 + " share stopover city: expected false | Computed: " + f1.isAStopOver(f2));
        System.out.println("Flights " + f2 + " and " + f1 + " share stopover city: expected true | Computed: " + f2.isAStopOver(f1));
        
        Flight f4 = new Flight("AA", 88, "LAX", "SFO");
        System.out.println("\nNew FLight f4 created: " + f4);
        System.out.println("Flights " + f2 + " and " + f4 + " are alternative flights: expected true | Computed: " + f2.isAnAlternative(f4));
        System.out.println("Flights " + f1 + " and " + f2 + " are alternative flights: expected false | Computed: " + f1.isAnAlternative(f2));
    }
}