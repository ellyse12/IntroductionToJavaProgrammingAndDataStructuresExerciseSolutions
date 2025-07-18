import java.util.Scanner;

public class q2_3 {
    /* (Convert meters into feet) Write a program that reads a number in meters, converts
it to feet, and displays the result. One meter is 3.2786 feet*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter meter: ");
        double meter = sc.nextDouble();

        double feet = meter * 3.2786;

        System.out.println(meter + " meter is : "+feet+" feet.");
    }
}
