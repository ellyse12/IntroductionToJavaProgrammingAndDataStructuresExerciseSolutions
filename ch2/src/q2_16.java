import java.util.Scanner;

public class q2_16 {
    /* (Geometry: area of a hexagon) Write a program that prompts the user to enter the
side of a hexagon and displays its area. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of hexagon: ");
        double side = sc.nextDouble();

        double area = (Math.pow(27,0.5) * Math.pow(side,2)) / 2;

        System.out.println("Area : " + String.format("%.3f",area));
    }
}
