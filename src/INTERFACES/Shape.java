package INTERFACES;

interface Shape {

      void color();
       void draw ();
      void calculate (int x, int y);
      void owner();
      void ID();
}

interface  shape2 extends Shape {
 //void owner();
}
 class Rectangle implements Shape{
    public void color() {
        System.out.println("Drawing a rectangle");

    }
    public void draw() {
        System.out.println("Color of the Rectangle is Red");
    }
    public void calculate(int x, int y) {
            System.out.println("Calculating area of a Rectangle: " + x*y);
    }

    public void owner() {
        System.out.println("the owner of a Rectangle is baker");
    }
public void ID() {
        System.out.println("The ID is: " + (int)Math.random()*1000);

}}