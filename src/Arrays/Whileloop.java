package Arrays;

import java.util.Scanner;

public class Whileloop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // int mynumber = 100;
       System.out.println("Enter a number between 1 and 100: ");
       int n=0;
      //int n=0;
        while ( n<=100) {
System.out.println("Enter your number ");
         n = sc.nextInt();
            if (n < 101)
              System.out.println(" Congs the number is corect");
            else if (n > 100)
                System.out.println(" the number is NOT corect");
        }
    }

}