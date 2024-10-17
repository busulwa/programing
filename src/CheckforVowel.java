import java.util.Scanner;

public class CheckforVowel {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");// for user to input any charactor
        char mychar = sc.next().toLowerCase().charAt(0); // it catches the userinput , converts ot lowercase, check the first index
        if (Character.isAlphabetic(mychar)) {  // checks if the inputer is not Alpgabetic-like numbers

            switch (mychar) {   // switch case checks the input if it matches the vowels
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vowel character is is a vowel");
                    break;
                default:
                    System.out.println("Vowel character is not a vowel");
            }
        }
            else
            System.out.println("Vowel character is not a consonant"); // completes the if statement
        }

    }
