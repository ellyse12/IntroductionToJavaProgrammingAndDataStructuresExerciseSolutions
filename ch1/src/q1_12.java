public class q1_12 {
    /*(Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40
minutes, and 35 seconds. Write a program that displays the average speed in
kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.) */

    public static void main(String[] args) {
        double dist = 24 * (1.6);
        double time = 1 + (40.0/60) + (35/(60*60.0));

        double avgSpeed = dist / time;
        System.out.println("Average speed : "+avgSpeed);
    }
}
