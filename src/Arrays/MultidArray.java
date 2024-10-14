package Arrays;

import OOP1.EmployeOOP;

import java.util.Scanner;

public class MultidArray {

    public static void main(String[] args) {

        int[][] multid = new int[3][3];

        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        for (i = 0; i < rows; i++) {
            multid[i][0] = sc.nextInt();
        }

        System.out.println(multid[0][0]);
    }
}