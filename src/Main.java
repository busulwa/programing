//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //constants declation
    static final int pk = 10;
    static  final double SALES_TAX = 15.3;

    public static void main(String[] args) {

 //adding 2 integers
        int x=10;
         int y=20;
          int sum = x+y;
        System.out.println("The sum of x & y is:\n" +" "+ sum +"\n");


//adding 2 variables with double data types
        double z= 34.6;
         double m= 45.8090;
          double addingboth = z+m;
System.out.println("The sum of z & m is:\n" +" "+ addingboth +"\n");


// adding an integer variable  and a double variable
int ad= 30;
 double xy= 445.89;
  double sum1 = ad+xy;
System.out.println("The sum of ad & xy is:\n" +" "+ sum1 +"\n");
// the sum is a double data type
//*****************************************************************

//Dividing 2 integers
        int mx = 36;
         int my= 12;
          int dev = mx/my;

System.out.println("The deviation of x and y is:\n" +" "+ dev +"\n");

// The bigger value can not be changed to double datatype , since initially was an integer
// double mx= 344.5;
System.out.println(mx);

//Dividing 2 variables  with double data type
    double mk= 234.88;
    double mp =342.90;
    double ddiv1 = mp/mk;
    System.out.println("The division of 2 double variables,mp and mk is:\n" +" "+ ddiv1 +"\n");

    // double variable casted to integer(converted to integer)
        int ddv1casted = (int) ddiv1;

        System.out.println(" The casted result is :\n" + ddv1casted +"\n"); // Print the result

/*declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
 Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q.
 Print q again. */
int x1=5;
int y1 =6;
int q= y1/x1;
System.out.println("X1 divide by y1 is = " + q +"\n");
double y1_casted = (double) y1;
System.out.println("y1 is casted to double :\n" + y1_casted +"\n");
//???????
System.out.println("y1 is now equal to q after casting is:\n" + q +"\n");

//declares   a constant and use it in a calculation
int pkf =78;
//the declared constant is pk
int sumpk = pk+pkf;
System.out.println("The sum of pkf is:\n" +" "+ sumpk +"\n");


// Orders for 3 products at a cafe

        char coffee;
        char green_tea;
        char cappucino;
           coffee= 30;
           green_tea= 12;
           cappucino = 50;

    int subtotal;
    double totalSale;

    int order1;
    int order2;
    int order3;
    //first order for 3 cups of coffee @ at 30$
    order1= coffee * 3 ;
    System.out.println("Order for 3 cups of coffee @ at 30$ costs:\n "+ order1 +"$");

        //second  order for 4 cups of green_tea @ at 12$
        order2= green_tea * 4 ;
        System.out.println("Order for 4 cups of green tea @ at 12$ costs:\n "+ order2 +"$\n");

        //third  order for 2 cups of cappucino @ at 50$
            order3= cappucino * 2 ;
            System.out.println("Order for 2 cups of cappucino @ at 50$ costs:\n "+ order3 +"$\n");


        //Calculating the subtotal
        subtotal =order2 + order1 + order3;
        System.out.println("Total subtotal for all orders is\n" + subtotal +"$\n");


        //Calculating total Sales with taxi of 15.3$
        totalSale =  SALES_TAX + subtotal;
        System.out.println("Total total sales  = " + totalSale +"$\n with sales taxi of 15.5$\n");
    }
}