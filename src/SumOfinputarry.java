import java.util.Scanner;
import java.util.Scanner;
public class SumOfinputarry {

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int[] arr= new int[5];
            int sum=0;
            int n=0;
            System.out.println("Enter 5 numbers");
            for (int i=0;i<arr.length;i++)
            {
                n= arr[i];
                n=  sc.nextInt();
                sum = sum + n;
            }
            System.out.println("The sum of elements is "+sum);
        }

    }

