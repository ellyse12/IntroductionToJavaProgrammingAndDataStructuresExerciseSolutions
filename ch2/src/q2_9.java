import java.util.Scanner;

public class q2_9 {
    /* Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
then displays the average acceleration. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting velocity and ending velocity in meters.");
        double v1 = sc.nextDouble();
        double v2 = sc.nextDouble();

        System.out.println("Enter time span in seconds");
        double seconds = sc.nextDouble();

        double acceleration = (v2 - v1) / seconds;

        System.out.println("The average acceleration is : "+ acceleration);

    }
}
