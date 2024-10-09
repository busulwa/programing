import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] array1 = new int[]{13,5,7,68,2};
        int mid = array1.length/2;//finds the middle index
        mid= array1[mid];//assi

        int mid1 = array1.length-1;// Shows the last index
        mid1= array1[mid1];
        System.out.println(Arrays.toString(array1));
System.out.println((mid));
System.out.println((mid1));
//********************************************************************
        /*Task 3: Write a program that creates an array of String type
         and initializes it with the strings “red,” “green,” “blue,” and “yellow.”
         Print out the array length. Make a copy using the clone( ) method. Use the
        Arrays.toString( ) method on the new array to verify that the original array was copied
         */
String[] mylist=new String[]{"red","green","blue","yellow"};
String[] newlist = mylist.clone();
System.out.println("the lenagth of mylist array is"+" " +mylist.length);
System.out.println("A clone methd has been used" +" "+ (Arrays.toString(newlist)));


int[] myelement = new int[]{6,7,5,4,9};
Arrays.sort(myelement);
System.out.println(Arrays.toString(myelement));
System.out.println("Value of first index is:" +" " +myelement[0]);
        Arrays.sort(myelement);
        System.out.println(myelement.length-1);
System.out.println("value of last index is:"+" "+ (myelement[myelement.length-1]));
//int newvale = myelement[5]=90;
System.out.println(Arrays.toString(myelement));


int[] news = new int[5];
for(int i=0; i<news.length; i++){
     news[i] = i;
    System.out.println(Arrays.toString(news));



//*********************************************************
//PA 303.3.1 - Practice Assignment - Strings

    Scanner  scanner = new Scanner(System.in);
    int start;
    int end;
    String S = scanner.next();
    //String S= "Helloworld";
    start = scanner.nextInt();
    end = scanner.nextInt();
    System.out.println(S.substring(start,end));
        }


        }
    }
