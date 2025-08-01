public class q2_18 {
    /*Write a program that displays the following table. Calculate the
middle point of two points.
 a b Middle Point
(0, 0) (2, 1) (1.0, 0.5)
(1, 4) (4, 2) (2.5, 3.0)
(2, 7) (6, 3) (4.0, 5.0)
(3, 9) (10, 5) (6.5, 7.0)
(4, 11) (12, 7) (8.0, 9.0) */
    public static void main(String[] args) {
                System.out.printf("%-10s %-10s %-20s\n", "a", "b", "Middle Point");

                int[][] points = {
                        {0, 0, 2, 1},
                        {1, 4, 4, 2},
                        {2, 7, 6, 3},
                        {3, 9, 10, 5},
                        {4, 11, 12, 7}
                };

                for (int[] p : points) {
                    double midX = (p[0] + p[2]) / 2.0;
                    double midY = (p[1] + p[3]) / 2.0;

                    System.out.printf("(%d, %d)   (%d, %d)   (%.1f, %.1f)\n",
                            p[0], p[1], p[2], p[3], midX, midY);
                }
            }
        }
