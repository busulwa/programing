package SumofStringsNumber;
import java.util.Scanner;
public class SumofNumber {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int sum=0;
        int ennumber;
        int count ;
        System.out.println("Enter a Count of numbers");
        count = sc.nextInt();
        System.out.println("Enter the numbers to add");
        for(int i=0; i<count; i++){

            ennumber =sc.nextInt();
        sum=sum +ennumber;
    }

System.out.print(sum);

}

}
