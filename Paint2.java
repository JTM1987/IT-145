import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math; // Import statement added for the Math class from java.lang Package

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded = 0.0; // Variable set to initial value of 0.0
        
        boolean heightValid = true;
        boolean widthValid = true;

        final double squareFeetPerGallons = 350.0;
        /* final double gallonsPerCan was removed, not needed
         * since we already have gallonsPaintNeeded and know that 1 can = 1 gallon
         */
        // Prompt user for height, handle invalid input
        do {
           try {
              System.out.println("Enter wall height (feet): ");
              wallHeight = scnr.nextDouble();
              if (!(wallHeight > 0)) {
                 System.out.println("Height must be greater than 0");
                 heightValid = false;
              } else {
                 heightValid = true;
                 // boolean set to true to break the do-while loop
              }
              // Handling bad input (not a number)
           } catch (InputMismatchException e) {
              scnr.next(); // throwing away bad input
              System.out.println("Not a valid input, must be a whole or decimal number greater than 0");
              heightValid = false; // To continue the loop, boolean heightValid is set to false
           }
        } while (!heightValid);
        

        // Prompt user to input wall's width, handle invalid input
        do {
           try {
              System.out.println("Enter wall width(feet): ");
              wallWidth = scnr.nextDouble();
              if (!(wallWidth > 0)) {
                 System.out.println("Width must be greater than 0");
                 widthValid = false;
              } else {
                 widthValid = true;
                 // As with height, set to true to break the loop
              }
           // Handling bad input (not a number)
           } catch (InputMismatchException e) {
              scnr.next();
              System.out.println("Not a valid input, must be a whole or decimal number great than 0");
              widthValid = false;
           }

        } while (!widthValid);
        
        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        // This print statement was already here but not explicitly stated as needed output in the Rubric
        // but was not sure so left it in the code
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed to paint the wall,
        // rounded up to nearest integer
        // Complete this code block
        
        /* Since we want a variable converted to the nearest integer or whole number
         * (as in number of cans of paint needed where 1 can equals 1 gallon)
         * without truncating decimal values, and want to round up,
         * we will use java.lang.Math.ceil()
         */
        // Tested with all four test cases
        cansNeeded = Math.ceil(gallonsPaintNeeded);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
        scnr.close();
    }
}
