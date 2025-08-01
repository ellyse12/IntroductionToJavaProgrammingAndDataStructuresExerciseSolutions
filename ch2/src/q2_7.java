import java.util.Scanner;

public class q2_7 {
    /* (Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and remaining days for
the minutes. For simplicity, assume that a year has 365 days. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter mins: ");
        long mins = sc.nextLong();

        double hours = mins / 60.0;
        int days = (int)hours / 24;

        int daysRemaining = days % 365;
        int years = days / 365;

        System.out.println(mins+" minutes is "+years+" years and "+daysRemaining+" days.");
    }
}
