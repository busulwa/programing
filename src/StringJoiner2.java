import javax.lang.model.element.NestingKind;
import java.util.Scanner;


public class StringJoiner2 {

    public static void main(String[] args) {

        String myString = "Hello World";
        String A ="hello";
        String B ="java";
        int summing;
        String comp= "No";

        //Sum of length of a and b
       summing = A.length() + B.length();
        System.out.println(summing);

//Determine if A is lexicographically larger than B
summing = A.compareTo(B); //System.out.println(summing);  // A is smaller than B
        if(summing< 0){
            System.out.println(comp);
        }else
            System.out.println("Yes") ;

System.out.println(A.toUpperCase().charAt(0)+ "ello "+" " +B.toUpperCase().charAt(0)+"ava\n\n");

//*****************************************************************************
System.out.print("Working with substrings\n");
        //Sub Strings
        String sub1= "Hello World";
        String sub2= "Helloworld";
        String str= sub1.substring(7);
   String str2= sub2.substring(3,7);
        System.out.println(str);


        System.out.println(str2);
    }
}
