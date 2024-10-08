import java.util.Arrays;

public class SubstringComparisons {

    public static void main(String[] args) {

 int [] n= new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
 for(int i=0; i<n.length; i++){
     if(n[i]%3 ==0 || n[i] % 5==0) {
         System.out.println(n[i]+"FizzBuzz");

     }else

     System.out.println(n[i]);
 }


    }
}
