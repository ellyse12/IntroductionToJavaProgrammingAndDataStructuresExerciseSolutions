import java.util.Scanner;

public class q2_11 {
/*(Population projection) Rewrite Programming Exercise 1.11 to prompt the user
to enter the number of years and display the population after the number of years.  */
    public static void main(String[] args) {
        double birthPerDay = (60*60*24) / 7.0;
        double deathPerDay = (60*60*24) / 13.0;
        double immigrantPerDay = (60*60*24) / 45.0;

        Scanner sc = new Scanner(System.in);
        int currentPopulation = sc.nextInt();
        int nextPopulation = currentPopulation + (int)(365*(birthPerDay + immigrantPerDay - deathPerDay));

        System.out.println("1 year after population is : "+nextPopulation);
    }
}
