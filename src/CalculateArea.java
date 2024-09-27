import java.util.Scanner;


public class CalculateArea {
    //creating a method called myarea to calculate the area of a triangle
    public static int myarea( int l, int w){//method 1 to calculate area of triangle
        return l*w;
    }

    public static int myarea1( int x, int y, int z, int h){// method 2, to calculate perimeter of triangle
      return x+y+z+h;
        //return 2 *(x+y);
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); //scanner for user input
        System.out.println("Enter the value of Length of the Triangle in cm: ");
        int l = myScanner.nextInt(); // taking the value of the length
        System.out.println("Enter the value of width of the Triangle in cm: ");

        int w = myScanner.nextInt(); //taking the value of width
        // int area= myarea;
        System.out.println("The area of a Triangle =:\n" +myarea(l,w)+"cm\n"); //printing the input values from the user

    if (myarea(l,w)<=1000){
        System.out.println("The area of a Triangle is less than 1000cm\n System is exiting, However,\n");//if area is <1000 system will exit
        System.out.println("To continue with the system make sure the area is > 1000cm otherwise \n");
        System.out.println("\"good bye!!\"");
        System.exit(0);
        }
    else if (myarea(l,w)>1000){ // if area is >1000 then it will jump to calculate perimeter of a triangle
        System.out.println("The area of a Triangle is greater than 1000,\n Now switching to calculating area of Triangle");
        System.out.println("Enter value for x");
         int x= myScanner.nextInt();
          System.out.println("Enter value for y");
            int y= myScanner.nextInt();
              System.out.println("Enter value for z");
                int z= myScanner.nextInt();
                   System.out.println("Enter value for h");
                       int h= myScanner.nextInt();

        System.out.println("The area of a Triangle =:\n" +myarea1(x,y,z,h)+"cm\n");

        System.out.println("Thank you for using the system  !!");
    }

        }


    }


