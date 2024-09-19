package main.shape;

public class Square extends Shape {
    //radius is not applicable to square




    @Override
    public void calculateArea(){
        double squareArea = width * height;
        System.out.println("The area of this square is " + squareArea);

    }

    @Override
    public void calculatePerimeter(){
        double squarePerimeter = 4 * width;
        System.out.println("The perimeter of this square is " + squarePerimeter);
    }

}
