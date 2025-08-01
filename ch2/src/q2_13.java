import java.util.Scanner;

public class q2_13 {
    /* (Financial application: compound value) Suppose you save $100 each month in a
savings account with annual interest rate 3.75%. Thus, the monthly interest rate is
0.0375/12 = 0.003125. After the first month, the value in the account becomes
 100 * (1 + 0.003125) = 100.3125
 After the second month, the value in the account becomes
 (100 + 100.3125) * (1 + 0.003125) = 200.938
 After the third month, the value in the account becomes
 (100 + 200.938) * (1 + 0.003125) = 301.878
 and so on.
Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your savings: " );
        double savings = sc.nextDouble();

        double interestRate = 0.003125;
        double total = 0;

        for (int i = 1; i<=6;i++){
            total = (total+savings) *  (1+interestRate);
            System.out.println(total);
        }


    }
}
