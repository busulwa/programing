import java.util.Scanner;

public class Stringmethods {

    static int myMethod(int l, int w)
    {
        return l*w;
    }

    public static void main(String[] args) {


        //method to calculate the area of my houses

        Scanner newscanner = new Scanner(System.in);
        // String to catch my house name
        String myhouse = new String();


        System.out.println("Enter name of house");
        // catches the name of the house and changes it to uppercase
        myhouse = newscanner.nextLine().toUpperCase();
        System.out.println("Your House is a\t" + myhouse);


        System.out.println("Enter Length \t");
        int l = newscanner.nextInt();
        System.out.println("Enter Width \t");
              int w= newscanner.nextInt();

        int houseare =  myMethod(l,w);
        System.out.println("Area of my house  is = \t" + (double)houseare+"cm");
        newscanner.nextLine();
if (houseare>100.0) {
    // String to catch the name of my Car
    System.out.println("Your can now buy a Car\t");
    System.out.println("Enter name of car you want to buy");
    String MyCar = new String();

    // catches the name of the Car and changes it to uppercase
    MyCar = newscanner.nextLine().toUpperCase();
    // Displays the name of house  and length of the string
    System.out.println("** My Car is a " + MyCar + "\nthe string  length is " + MyCar.length());

    System.out.println("** MY house is\t" + myhouse + "\tand my car is " + MyCar);
}else {

    System.out.println("You can not buy a Car");
}
 // Condition statement to check if my house is Flat
        // boolean xy= false;

    if(myhouse.equals("FLAT")){
        System.out.println("Yes, my house is a flat");
    }else
        System.out.println("No, your house is not a flat");

        // static myhouse= myhouse.length(int);
        // System.out.println(MyCar.length());
        // System.out.println(MyCar.toLowerCase());


    }}




