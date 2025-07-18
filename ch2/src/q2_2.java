import java.util.Scanner;

public class q2_2 {
    /* (Compute the volume of a triangle) Write a program that reads in the length of
sides of an equilateral triangle and computes the area and volume using the following formulas:
 area =
23
4 (length of sides)2
 volume = area * length*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the sides: ");
        double length = sc.nextDouble();

        double area = ((Math.sqrt(3)) / 4.0) * (Math.pow(length,2));
        double volume = area * length;

        System.out.println("The area is: "+ area);
        System.out.println("The volume is: "+ volume);
    }
}
