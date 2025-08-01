import java.util.Scanner;

public class q2_12 {
    /* (Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula: length = v^2/2a
 Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2), then, displays the minimum runway length. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter takeoff speed as meter/second: ");
        double velocity = sc.nextDouble();

        System.out.println("Enter acceleration as meter/second^2: ");
        double acceleration = sc.nextDouble();

        double minRunwayLength = Math.pow(velocity,2) / (2 * acceleration);

        System.out.println("Minimum runway length : " + String.format("%.3f",minRunwayLength));
    }
}
