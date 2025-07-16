public class q1_9 {
    /* (Area and perimeter of a rectangle) Write a program that displays the area and perimeter of a rectangle with a width of 5.3 and height of 8.6 using the following formula:
area = width * height
perimeter = 2 * (width + height)*/
    public static void main(String[] args) {
        double width = 5.3;
        double height = 8.6;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);

    }
}
