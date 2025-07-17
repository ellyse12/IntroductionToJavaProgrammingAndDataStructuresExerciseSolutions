import java.util.Scanner;

public class q2_1 {
    /*(Convert mile to kilometer) Write a program that reads a mile in a double value
from the console, converts it to kilometers, and displays the result. The formula
for the conversion is as follows:
 1 mile = 1.6 kilom */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter mile as double value: ");
        double mile = sc.nextDouble();

        double kilometer = mile * 1.6;

        System.out.println(mile+" mile is "+kilometer+" km.");

    }
}
