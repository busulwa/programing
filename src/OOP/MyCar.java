package OOP;

import java.util.Scanner;

public class MyCar {

    private String name;
    private String color;
    private String make;
    private int year;




    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }
    public void display() {
        System.out.println("MY CAR IS CALLED: " + name+"IT IS COLOR"+color);
    }

    public int areaOf(int x,int y){
        return x*y;


    }

    Scanner myscanner = new Scanner(System.in);

}