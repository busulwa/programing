import java.util.Arrays;

public class FizzBuzz {


    public static void main(String[] args) {


        int[] n = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};


        for( int i=0; i<n.length; i++) {
            //System.out.print(n[0]+ "\n");
            if(n[i] % 3==0 && n[i]%5 ==0) {
                System.out.print("FizzBuzz\n");
            }else if(n[i] % 3==0 && n[i] %5 !=0){
                System.out.print("Fizz\n");
            }else if (n[i] % 5==0 && n[i]%3 !=0){
                System.out.print("Buzz");
            }else
                if(n[i]%3!=0 && n[i]%5 !=0){
                    System.out.print(n[i]+"\n");
                }
            float a= 2.3;
        }



    }




}
