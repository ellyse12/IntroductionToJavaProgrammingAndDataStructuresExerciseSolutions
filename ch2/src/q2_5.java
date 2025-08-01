import java.util.Scanner;

public class q2_5 {
    /* (Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate and then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2
as gratuity and $11.2 as total. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter subtotal : ");
        double subtotal = sc.nextDouble();

        System.out.println("Enter gratuity rate : ");
        double gratuityRate = sc.nextDouble();

        double gratuity = (subtotal*gratuityRate)/100;

        double total = subtotal + gratuity;

        System.out.println("Subtotal = " + subtotal);
        System.out.println("Gratuity = " + gratuity);
        System.out.println("Total = "+ total);

    }
}
