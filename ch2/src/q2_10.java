import java.util.Scanner;

public class q2_10 {
    /*(Science: calculating energy) Write a program that calculates the energy needed
to heat water from an initial temperature to a final temperature. Your program
should prompt the user to enter the amount of water in kilograms and the initial
and final temperatures of the water. The formula to compute the energy is
 Q = M * (finalTemperature – initialTemperature) * 4184
 where M is the weight of water in kilograms, initial and final temperatures are in
degrees Celsius, and energy Q is measured in joules. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight of water in kilograms: ");
        int m = sc.nextInt();
        System.out.println("Enter initial temperature: ");
        int initialTemp = sc.nextInt();
        System.out.println("Enter final temperature: ");
        int finalTemp = sc.nextInt();

        int q = m * (finalTemp - initialTemp) * 4184;

        System.out.println("Required energy is : "+ q);
    }
}
