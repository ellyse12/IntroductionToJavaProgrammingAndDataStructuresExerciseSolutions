import java.util.Scanner;

public class q2_17 {
    /*(Science: wind-chill temperature) How cold is it outside? The temperature alone
is not enough to provide the answer. Other factors including wind speed, relative
humidity, and sunshine play important roles in determining coldness outside. In 2001,
the National Weather Service (NWS) implemented the new wind-chill temperature
to measure the coldness using temperature and wind speed. The formula is
twc = 35.74 + 0.6215ta - 35.75v0.16 + 0.4275tav0.16
 where ta is the outside temperature measured in degrees Fahrenheit, v is the speed
measured in miles per hour, and twc is the wind-chill temperature. The formula
cannot be used for wind speeds below 2 mph or temperatures below -58°F or
above 41°F.
Write a program that prompts the user to enter a temperature between -58°F
and 41°F and a wind speed greater than or equal to 2 then displays the wind-chill
temperature. Use Math.pow(a, b) to compute v0.16. */
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
                double ta = input.nextDouble();

                System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
                double v = input.nextDouble();

                if (ta < -58 || ta > 41 || v < 2) {
                    System.out.println("Invalid input. Temperature must be between -58°F and 41°F and wind speed must be >= 2 mph.");
                } else {
                    double windChill = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);
                    System.out.println("The wind chill index is " + windChill);
                }
            }
        }



