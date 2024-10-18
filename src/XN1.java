import java.util.Scanner;
public class XN1 {

        public static void main(String[] args) {
            Scanner y = new Scanner(System.in);
            int big = 10;
            int x = 0;
            int i = 0;

            while (i < 5) {
                System.out.println("Enter a number:");
                x = y.nextInt();
                i++;

                if (big - x > 5) {
                    System.out.println("Big");
                } else {
                    System.out.println("Not Big");
                }
            }

            // Close the scanner
            y.close();
        }
    }