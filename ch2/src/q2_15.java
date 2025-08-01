import java.util.Scanner;

public class q2_15 {
    /* (Geometry: distance of two points) Write a program that prompts the user to enter
two points (x1, y1) and (x2, y2) and displays their distance. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1 and x2");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        System.out.println("Enter y1 and y2");
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double euclideanCalc = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
        double euclideanDist = Math.pow(euclideanCalc,0.5);

        System.out.println("Distance between ("+x1+","+x2+") and ("+y1+","+y2+") is = "+String.format("%.3f",euclideanDist));
    }
}
