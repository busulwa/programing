import java.util.Scanner;

public class ControlFlow {


    public static void main(String[] args) {


        int x = 20;
        if (x < 10) {
            System.out.println("Less than 10");

        } else if (x > 10 && x < 20) {

            System.out.println("Greater than 10 but less than 20");
        }


        //*****************************************************
        //Using  if-else-if statements to print out grades
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks = scr.nextInt();
        if (marks > 89 && marks < 100) {
            System.out.println("A");
        } else if (marks > 79 && marks < 90) {
            System.out.println("B");

        } else if (marks > 69 && marks < 80) {
            System.out.println("C");

        } else if (marks > 59 && marks < 70) {
            System.out.println("D");

        } else if (marks < 60) {
            System.out.println("F\n");
        }
        //*********************************************
        //Using the switch tp print out corresponding day
        int h = 4;

        switch (h) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday\n");
        }
        //*********************************************************
        //Calculating taxes using if-else
        String status;
        Long income;
        System.out.println("Enter Status");
        status = scr.next();
        System.out.println("Enter Income");
        income = scr.nextLong();
        if (status.matches("single") || status.matches("Married_Filing_Separately") && income <= 8350
                || (status.matches("Married_Filing_Jointly") && income < 16690)
                || (status.matches("Head_of_Household") && income < 11949)) {
            System.out.println("Your tax is 10%");
        } else if (status.matches("single") || status.matches("Married_Filing_Separately") && income >= 8351 && income < 33950
                || (status.matches("Married_Filing_Jointly") && income >= 16701 && income < 67900)
                 ||  (status.matches("Head_of_Household") && income >= 11951 && income < 45499)){
            System.out.println("Your tax is 15%");
        } else if (status.matches("single") || status.matches("Married_Filing_Separately") && income >= 33951 && income < 82250
                || (status.matches("Married_Filing_Jointly") && income >= 67901 && income < 137050)
                ||  (status.matches("Head_of_Household") && income >= 45501 && income < 117450)){
            System.out.println("Your tax is 25%");

        }
    }

}
















