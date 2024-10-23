package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {

    public static void main(String[] args) {

  String[] name= {"ball","bat","glove","glove","glove"};
     int[] price ={2,3,1,2,1};
     int[] weight = {2,5,1,1,1};
     String dup = "glove";
for(int i=0;i<name.length;i++){
if(name[i].contains(dup)){
    System.out.println(+i);
break;
}


    }
}}
