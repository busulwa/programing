import javax.lang.model.element.NestingKind;
import java.util.Scanner;


public class StringJoiner2 {

    public static void main(String[] args) {

        /*Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.*/

        String myString = "Hello World";
        String A ="hello";
        String B ="java";
        int summing;


        //Sum of length of a and b
       summing = A.length() + B.length();
        System.out.println(summing);
                //Determine if A is lexicographically larger than B
        summing = A.compareTo(B); //System.out.println(summing);  // A is smaller than B
        if(summing< 0){
            System.out.println("No");
        }else
            System.out.println("Yes") ;
A=A.toUpperCase().charAt(0)+ A.substring(1);
// Converts the first letter of hello to capital , then adds on the remmining letter starting from index 1 which is "ello")
B=B.toUpperCase().charAt(0)+ B.substring(1);
// Converts the first letter of java to capital , then adds on the remmining letter starting from index 1 which is "ava")
//A= A.toUpperCase().charAt(0) + A.substring(1) ;

        // B.toUpperCase().charAt(0) + B.substring(1) ;
             System.out.println(A+ " " +B);


// Option 2

        Scanner sc=new Scanner(System.in);

        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());

        // Compare lexicographically
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        // Capitalize first letter of each string
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Print the capitalized strings
        System.out.println(A + " " + B);

        sc.close();










//*****************************************************************************

        /* Given a string, , and two indices,  and , print a substring consisting of
        all characters in the inclusive range from  to . You'll find the String class'
        substring method helpful in completing this challenge.*/

System.out.print("Working with substrings\n");
        //Sub Strings
        String sub1= "Hello World";
        String sub2= "Helloworld";
        String str= sub1.substring(7);

        //option 1
        String str2= sub2.substring(3,7);
        System.out.println(str2+"\n");



     String start="Hello";
     String end="world";
     String S=start+end;
        System.out.println(S+"\n" + S.length());

//option 2
//this
        S = S.substring(3,7);
        System.out.println("" + S);
    }
}
