package main.shape;

public class Shape {
    // Properties
    public double width;
    public double height;
    public double radius;
    public String color;



    public Shape(){

    }
    // Abstract methods for calculating area and perimeter
    public void calculateArea(){

    };

    public void calculatePerimeter(){

    };

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();

        circle.height = 10;
        circle.color = "red";

        circle.calculateaPerimeter();
        circle.calculateArea();
square.width = 10;
square.height = 10;
square.calculatePerimeter();
square.calculateArea();

    }
}

