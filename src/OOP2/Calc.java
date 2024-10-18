package OOP2;

import OOP1.EmployeOOP;


public class Calc {

    public static void main(String[] args) {

        EmployeOOP tt= new EmployeOOP(10 ,20,"baks");

        tt.displayDetails();
        //System.out.println(tt);

//Calling Parent class
Inheritance1 inn = new Inheritance1();

inn.getvalues(20,50);
inn.display();
//System.out.println(inn);

//Calling etender class that inherits from Inheritance1
extender xxx= new extender();
//xxx.input(89);
xxx.getvalues(70,60);// you can now use the xxx to use getvalues from the Inheritance parrent class
xxx.display();
xxx.input(12);
xxx.displayc();




    }
}
