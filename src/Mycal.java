import java.util.Scanner;

public class Mycal {


    public static void main(String[] args) {

int x;
int result;
int y;

char operator;

        Scanner newsc = new Scanner(System.in);
        System.out.println("Enter Your First number ");
        x=newsc.nextInt();
        System.out.println("Enter Your Second number ");
        y=newsc.nextInt();
        System.out.println("Enter Operator");
        operator =newsc.next().charAt(0);
       // modulas1= newsc.next().charAt(0);

        switch (operator) {
            case '+':
                result = x + y;
               System.out.println("Your Sum is "+ result);
               break;
               case '-':
                   result = x - y;
               System.out.println("Your diffrence is "+ result);
               break;
               case '%':
                   result = x % y;
                   System.out.println("Your Modulas is "+ result);
                   break;
        }
    }
}
