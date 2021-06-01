package sef.module6.activity;

public class AbstructionActivity {
    public static void main(String[] Args) {
        Shape p1 = new Square(5);
        Shape p2 = new Rectangle(6, 8);
        p1.setColor("Red");
        System.out.println("*** Print the information for Square");
        System.out.println("Color of square :" + p1.getColor());
        System.out.println("Area of square:" + p1.calculateArea());
        System.out.println("Perimeter of square:" + p1.calculatePerimeter());

        p2.setColor("Blue");
        System.out.println("*** Print the information for Rectangle");
        System.out.println("Color of rectangle :" + p2.getColor());
        System.out.println("Area of rectangle:" + p2.calculateArea());
        System.out.println("Perimeter of rectangle:" + p1.calculatePerimeter());

    }
}