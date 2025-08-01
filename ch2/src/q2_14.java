import java.util.Scanner;

public class q2_14 {
    /* (Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing, by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
one pound is 0.45359237 kilograms and one inch is 0.0254 meters. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight as pounds: ");
        double weightPound = sc.nextDouble();
        System.out.println("Enter your height as inches: ");
        double heightInches = sc.nextDouble();

        double weightKilograms = weightPound * (0.45359237);
        double heightMeters = heightInches * (0.0254);

        double BMI = weightKilograms / Math.pow(heightMeters,2);

        System.out.println("BMI is : "+String.format("%.3f",BMI));
    }
}
