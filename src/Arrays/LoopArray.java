package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LoopArray {



    public static void main(String[] args) {
        int[] mymarks = new int[5];
        int sum=0;
        int i=0;
        int average=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers");

    for(i=0;i<mymarks.length;i++) {
        mymarks[i] = input.nextInt();

      sum =sum+ mymarks[i];
     average = sum/mymarks.length;

}
        System.out.println(Arrays.toString(mymarks));
        System.out.println("SUM:" +sum);
        System.out.println("AVERAGE:" +average);
    }
}