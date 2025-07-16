public class q1_10 {
    /* (Average speed in miles) Assume that a runner runs 15 kilometers in 50 minutes
and 30 seconds. Write a program that displays the average speed in miles per hour.
(Note that 1 mile is 1.6 kilometers.)*/

    public static void main(String[] args) {
        double kilometers = 15.0;
        double minutes = 50.5;

        double miles = kilometers / 1.6;
        double hours = minutes / 60;

        double avgSpeed = miles / hours;

        System.out.println("Average speed: "+ avgSpeed+" mph");
    }
}
