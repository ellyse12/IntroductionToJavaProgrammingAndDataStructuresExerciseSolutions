import java.util.Scanner;

public class q2_8 {
    /* (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
the current time in GMT. Revise the program so it prompts the user to enter the
time zone offset to GMT and displays the time in the specified time zone */

    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter GMT : ");
        int gmt = sc.nextInt();

        System.out.println("Current time is " + ((currentHour+gmt)%24) + ":"
                + currentMinute + ":" + currentSecond + " GMT");
    }
}
