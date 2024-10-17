import java.util.Scanner;

public class ChecksmallNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        //if (Character.isAlphabetic(n))
        int small= sc.nextInt();
 small=0;
      for(int i=1;i<=9;i++){

          small = i;
if(small<=5){
    System.out.println("to small");
} else if (small>5) {
    System.out.println("its a bigger number");

}

      }
    }
    }

