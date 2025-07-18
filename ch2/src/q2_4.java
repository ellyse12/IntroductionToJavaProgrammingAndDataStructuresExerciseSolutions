import java.util.Scanner;

public class q2_4 {
    /* (Convert square meter into ping) Write a program that converts square meter into ping.
The program prompts the user to enter a number in square meter, converts it to ping,
and displays the result. One square meter is 0.3025 ping.
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter square meter: ");
        double squareMeter = sc.nextDouble();

        double ping = squareMeter * 0.3025;
        System.out.println(squareMeter+" square meter is "+ping+" ping.");
    }

}
