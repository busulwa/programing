import java.util.Scanner;


public class CalculateArea {
    //creating a method called myarea to calculate the area of a triangle
    public static int Myarea( int l, int w){//method 1 to calculate area of triangle
        return l*w;
    }
    public static int Perimeter( int x, int y){// method 2, to calculate perimeter of triangle
      //return x+y+z+h;
        return 2 *(x+y); //returns perimeter by multiplying x+y by 2
    }
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in); //scanner for user input

        System.out.println("Introduce your self");
        String name = myScanner.nextLine().toUpperCase();//introduced a String and converted it to Upper Case
        System.out.println(" Your are welcome:\t" + name);
  //for(name.){
  //  System.out.println("no");
 // }
        System.out.println("Enter value for Length of the Triangle in cm: ");
        int l = myScanner.nextInt(); // taking the value of the length
        System.out.println("Enter value for width of the Triangle in cm: ");

        int w = myScanner.nextInt(); //taking the value of width
        // int area= myarea;
        System.out.println("The area of a Triangle =:\n" +Myarea(l,w)+"cm\n"); //printing the input values from the user

        double NewArea= (double)Myarea(l,w); // type casting the Area to double
                System.out.println("The New type casted area of a Triangle =:\n" +NewArea+"cm\n");

    if (Myarea(l,w)<=100){ // using the <= operators
        System.out.println("The area of a Triangle is less than 100cm\n System will exit, However,\n" +
                "To continue make sure the area is > 100cm otherwise \n");//if area is <1000 system will exit

        System.out.println("\"good bye!!\"");
        System.exit(0);
        }
    else if (Myarea(l,w)>100){ // if area is >1000 then it will jump to calculate perimeter of a triangle
        System.out.println("The area of a Triangle is greater than 100,\n Now switching to calculating Perimeter of Rectangle");
        System.out.println("Enter value for side 1");
         int x= myScanner.nextInt();
          System.out.println("Enter value for side 2");
            int y= myScanner.nextInt();
              //System.out.println("Enter value for z");
               // int z= myScanner.nextInt();
                  // System.out.println("Enter value for h");
                      // int h= myScanner.nextInt();

        System.out.println("The Perimeter of the Rectangle =\n" + Perimeter(x,y)+"cm\n");

        System.out.println("Thank you for using the system  !!");
        myScanner.close();
    }

        }


    }


