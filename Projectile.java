
/**
 * Calculates the physics of a projectile
 *
 * @author Curtice Gough
 * @version 10/30/18
 */
import java.util.Scanner;
public class Projectile
{
    public static void main(String [] args)
    {
        // construct objects
        Scanner in = new Scanner(System.in);
        
        // initialize local variables
        double gravity = 9.81; //acceleration due to gravity
        //user defined
        double launchHeight;
        double launchAngle;
        double muzzleVelocity;
        //calculated
        double verticalVelocity;
        double horizontalVelocity;
        double maximumHeight;
        double flightTime;
        double range;
        
        // prompt user for information
        System.out.println("Welcome to the Projectile Physics Calculator!");
        System.out.println("Note: All measurements use the metric scale\n");
        System.out.print("Please enter the muzzle velocity: ");
        muzzleVelocity = Double.parseDouble(in.next());
        
        System.out.print("Please enter the launch angle (0 = straight ahead; 90 = straight up): ");
        launchAngle = Double.parseDouble(in.next());
        
        System.out.print("Please enter the launch height (0 = ground): ");
        launchHeight = Double.parseDouble(in.next());
        
        // calculations
        verticalVelocity = muzzleVelocity * Math.sin(Math.toRadians(launchAngle));
        horizontalVelocity = muzzleVelocity * Math.cos(Math.toRadians(launchAngle));
        maximumHeight = ((verticalVelocity / 2) * (verticalVelocity / gravity)) + launchHeight;
        flightTime = (verticalVelocity / gravity) + Math.sqrt((maximumHeight * 2) / gravity);
        range = horizontalVelocity * flightTime;
        
        // final print statements
        System.out.printf("\n\n%34s\n", "Initial Parameters");
        System.out.println("==================================================");
        System.out.printf(" %-15s %,26.2f m\n", "Launch Height", launchHeight);
        System.out.printf(" %-15s %,26.2f m\n", "Launch Angle", launchAngle);
        System.out.printf(" %-15s %,26.2f m\n", "Muzzle Velocity", muzzleVelocity);
        System.out.println("==================================================\n");
        System.out.printf("%28s\n", "Results");
        System.out.println("==================================================");
        System.out.printf(" %-19s %,22.2f m/sec\n", "Vertical Velocity", verticalVelocity);
        System.out.printf(" %-19s %,22.2f m/sec\n", "Horizontal Velocity", horizontalVelocity);
        System.out.printf(" %-19s %,22.2f m\n", "Maximum Height", maximumHeight);
        System.out.printf(" %-19s %,22.2f m\n", "Range", range);
        System.out.printf(" %-19s %,22.2f sec\n", "Flight Time", flightTime);
        System.out.println("==================================================");
    }
}
