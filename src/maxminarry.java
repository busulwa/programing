import java.util.Arrays;

public class maxminarry {

    public static void main(String[] args) {

int[] arry1 = {2,100,3,90,5};
        double[] x = new double[]{7,8}; //also declare a new array using the new keyword
int sum= arry1[0];
int avg=arry1[0];//finding average of the sum
int[] arry2 = arry1.clone();//copying array ellements into a new array
        int[] arry3 = Arrays.copyOf(arry1,6); // copys 4 arry1 elements into a new array 3
         Arrays.sort(arry2);//sorts th array in order
int src= Arrays.binarySearch(arry2,90); // return index of a value in a the arra

for(int i=1;i<arry1.length;i++){  //iterates thru the elements
    sum = sum +arry1[i];   //finds the sum
    avg= sum/arry1.length;
}
System.out.println(Arrays.toString(x));
System.out.println(sum);
System.out.println(avg);
System.out.println(Arrays.toString(arry2));//Arrays.toString(array name) returns a string of the    array 2
System.out.println(Arrays.equals(arry2,arry3));//compares the arrays and returns a bolean
System.out.println("the binaryindex of 90 in array2 is " +src);
System.out.println("the elements copied from arry1"+(Arrays.toString(arry3)));//
        }

    }



