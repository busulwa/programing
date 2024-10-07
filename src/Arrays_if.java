import java.util.Arrays;

public class Arrays_if
{

    public static void main(String[] args) {
int[] mynew= new int[]{1,3,2,9,7,8,};
      // int y=100;

       for(int i=0;i<mynew.length;i++){
         if(mynew[i]% 3==0 || mynew[i]%2==0){
             System.out.println("Its Ord");
         }else
if(mynew[i]-1==0){
    System.out.println(mynew[i]+":\t Is the  First valiable");

       }else
    Arrays.sort(mynew);
           System.out.println(mynew[i]);



   System.out.println(Arrays.toString(mynew));
    break;
}


       }
       }




