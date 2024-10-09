package OOP;

import java.util.Scanner;

public class mycarPoperties {
    public static void main(String[] args) {
        MyCar newcar = new MyCar();//new method using our class Mycar to access the attributes of the car
         //setting values for the variables or the car
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color");
        newcar.setColor(sc.next());
        System.out.println("Enter Car Name");
        newcar.setName(sc.next());
        System.out.println("Enter Year");
       newcar.setYear(sc.nextInt());

        System.out.println("MY CAR color IS "+newcar.getColor()+"\nIt's Name is "+newcar.getName()
        +"\nThe year of manufature is "+newcar.getYear());
//get- used to get the values set for the variables of the car

/// this methoad (myarea) access class area0f whic multiplies 2 numbers
    MyCar myarea = new MyCar();
    int num1= 5;
    int num2=10;
    int results;
   results= myarea.areaOf(num1,num2);
    System.out.println(results);



}}
