package KBPRACTEXAM;

import java.util.ArrayList;
import java.util.Scanner;

public class whilearrylist {

    public static void main(String[] args) {
        String names ="baker busul wahana";
        Scanner sc = new Scanner(names);
        //names = sc.next();
        ArrayList mylisy = new ArrayList();

        while (sc.hasNext()) {
            mylisy.add(sc.next());


        }
        System.out.println(mylisy);

    }
}