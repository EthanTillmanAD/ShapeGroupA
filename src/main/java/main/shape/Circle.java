package main.shape;

public class Circle extends Shape{


    static double pi = Math.PI;
  @Override
    public double getRadius() {
        this.radius = height / 2;
//height == diameter
        return this.radius;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void calculateArea(){

        double area = (getRadius()) * (getRadius()) * pi;
        System.out.printf("The area of this " + this.color + " circle is " + "%,.2f \n", area);

    };
    public void calculateaPerimeter(){
        double perimeter = (getRadius() * 2) * pi;
        System.out.printf("The perimeter of this " + this.color + " circle is " + "%,.2f \n", perimeter);

    };




}