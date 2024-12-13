[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/sLnPfl6C)
# CS230X-assignment2-F24
# Java Classes

In this assignment, you will...

Goals:
- [ ] Define and use Java classes
- [ ] Compare floats
- [ ] Work with both static and instance methods
- [ ] Practice with testing and documentation

## Task 1: Points and Distances

### Point Class
Create a class, named <code>Point</code> to represent a point on the Cartesian plane.
[Study our own Point documentation.](https://cs.wellesley.edu/~cs230x/assignments/assign201/doc/Point.html)

### Step 1: Instance variables
A point in the Cartesian plane has **x** and **y** coordinates, both of type `double`.

### Step 2: Constructors
Provide two constructors:
* A constructor without parameters creates a Point at location (0.0, 0.0).
* A two-parameter constructor takes as input two double numbers corresponding to x and y, and constructs an object of type Point at location (x,y).

### Step 3: toString()
As with any other class you write, define a **toString()** method to provide the means of
printing the contents of the object in an informative and concise way.

### Step 4: Getters and setters
Include appropriate getters and setters. Make sure to check the [javadoc](https://cs.wellesley.edu/~cs230x/assignments/assign201/doc/Point.html) to see which getters and setters we expect.

### Step 5: Instance methods

Define the following instance methods:

* **findDistance()**: an *instance* method that takes as parameter a `Point`. It computes and returns the distance between the current `Point` (also known as <code>this</code>) and the parameter, using the Pythagorean formula.

* **areEquidistant()**: an *instance* predicate method that takes as input two `Point` objects, and returns true iff (if and only if) the distances between the current (`this`) Point and each of the input points differ by less than some amount called *TOLERANCE*. Define TOLERANCE as a final variable with the value of 0.01.

* Include a  **main()** method for testing purposes. Make sure to create at least three instances of type `Point`. Compute, and report if any of the points created is equidistant to the other two.


### Notes and tips:

* Read the book section about comparing floating point values. It is recommended that you do not use "==". Tip: The *TOLERANCE* will be helpful here.  
* The `main()` method should be short and high level: It should consist primarily of calling other methods from the class.
* Make sure to test each method carefully before moving on to the next one.
* Choose your testing cases carefully to thoroughly test all the methods you defined. Print what you expect the test to produce and the result of your method call.


## Task 2: Flights and Stopovers

Implement a class called **Flight**
[(here is the Flight javadoc)](https://cs.wellesley.edu/~cs230x/assignments/assign202/doc/Flight.html)
to represents an airline flight.

### Step 1: Instance variables
The following properties represent a Flight object:
1. the name of the airline,
2. the flight number,
3. the flight's origin city, and
4. the flights's destination city.

### Step 2: Constructor
Create a constructor for a Flight object. This should take as input all the needed information to create a flight. 

### Step 3: instance methods
1. **toString()**
As with any other class you write, define a **toString()** method to provide the means of printing the contents of the object in an informative and concise way. Don't forget to use this method as you test your code in the main().

2. **isAnAlternative()**
a predicate method that takes as input a flight and returns true iff (if and only if) the invoker flight's origin and destination are the same as the input flight's origin and destination.

3. **isAStopOver()**
a predicate method that takes as input a flight and returns true iff (if and only if) the invoker flight's destination is the same as the input flight's origin.

### Step 4: Static methods
Create the following methods:

1. **readFlight()**:
a *static* method that asks and collects from the user all the information regarding a flight. Using this information, it creates a Flight, and returns it. This method takes as input a `Scanner`.

2. Make sure to include a  **main()** method, for testing purposes. As always, make sure you test all the methods you have defined, and to test each method before moving onto the next one.

It is important that you write code in your `main()` method to test your program thoroughly. In it create a few Flight objects, and test all your methods on them. Here's an example output:

```
Testing manual entry
New Flight f1 entered:AA123 from BOS to LAX 

Testing constructor
New Flight f2 created:DL55 from LAX to SFO 

Testing constructor
New Flight f3 created:OA1234 from SFO to ATH 

Testing getAirline(f1):(AA)->: AA
Testing getFlightNumber(f1):(123)->: 123
Testing getOrigin(f1):(BOS)->: BOS
Testing getDestination(f1):(LAX)->: LAX

Flights AA123 from BOS to LAX  and DL55 from LAX to SFO  share stopover city (TRUE)->: true
Flights DL55 from LAX to SFO  and AA123 from BOS to LAX  share stopover city (FALS)->: false
Flights DL55 from LAX to SFO  and OA1234 from SFO to ATH  share stopover city (TRUE->): true

Testing setDestination(f1):BOS
Testing setOrigin(f1):SFO

Testing changes to Flight f1:AA123 from SFO to BOS
Flights AA123 from SFO to BOS  and DL55 from LAX to SFO  share stopover city (FALSE)->: false
Flights DL55 from LAX to SFO  and AA123 from SFO to BOS  share stopover city (TRUE)->: true
```

## SAVING YOUR WORK ON GITHUB
As we have discussed in class, it is important to work on labs and assignments regularly and save frequently. You should test your work incrementally, which will require you to save your file before compiling/running it. In addition to saving your work on your local machine, you should also frequently push your work to this Github repository. You can refer to Lab0 and the [Git and Github tutorial](https://github.com/CS230X-F24/github-starter-course) for a refresher on using these tools. 

## SUBMITTING TO GRADESCOPE
Turn in your work submitting files Point.java and Flight.java to your Gradescope account for Assignment 2. [Click here for Gradescope instructions.](https://docs.google.com/document/d/1zGAJrbdAhfPZVlyDP9N3MmdKXWvNo7rQqehKNM5Q0_M/edit) 

## AUTOGRADER
When you submit your assignment to Gradecope, you will **not** immediately see feedback. You are welcome to resubmit as many times as you wish until the deadline but you will only receive feedback after the grades have been published. Click here for 230X instructions on: [testing your code](https://docs.google.com/document/d/19cKOyolT8UtSfMNrVw8MGgVWS-lYgHpBs8g2Cf_8Vvc/edit#heading=h.rt39ohf1jp6s), [styling your code](https://docs.google.com/document/d/14uwj9HAjNKfFBm0ZjUpWR7jdqKSj13rudIEJaG74mPk/edit), and [documenting your code](https://docs.google.com/document/d/15uqs_NH8y2sAuLLpiZuSxlI0UsL6a8CHuWY_qcvF4B4/edit). 

## ASSIGNMENT SOLUTIONS
Assignment solutions will not be shared. If you did not get full credit on the assignment, you should review the feedback and ask me or the TAs if you have further questions.   
