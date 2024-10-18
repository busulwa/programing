package KBPRACTEXAM;

public class SubStrings {

    public static void main(String[] args) {

        String s= "hello Java";


        String result= s.substring(0,1).toUpperCase()+ s.substring(1);
        System.out.println(result+"\n");


        String result2= s.substring(2,5) + s.substring(5,8);
        result2=result2.replaceAll("\\s","");// it removes the white spaces
        System.out.println(result2+"\n");
}}
