package KBPRACTEXAM;

import java.util.ArrayList;

public class ArryLists {


    public static void main(String[] args) {


        ArrayList mylist = new ArrayList();

        mylist.add("mango");
        mylist.add("apple");
        mylist.add("orange");


        System.out.println(mylist.contains("orange"));
        System.out.println(mylist.getFirst());
        System.out.println(mylist.getLast());
        System.out.println(mylist.size());
    }
}