//1. Create an Interface 'Shape' with undefined methods
//as calculateArea and calculatePerimiter.
//    Create 2 classes Circle & Square that implements functionality
//    defined in the Shape Interface. Test your code.

public class GroupTask01 {
}

interface Shape{
    void calculateArea();
    void calculatePerimeter();
}

class Circle implements Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of the circle with a radius of "+radius+" is "+Math.PI*Math.pow(radius,2));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of the circle with a radius of "+radius+" is "+Math.PI+(2*radius));
    }
}

class Square implements Shape{
    int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        System.out.println("The perimeter of a square with a side length of "+length+" is "+(4*length));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The area of a square with a side length of "+length+" is "+(Math.pow(length,2)));
    }
}