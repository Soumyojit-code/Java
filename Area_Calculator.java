class Shape {
   
    Shape(double side) {
        double area = side * side;
        System.out.println("Area of the square: " + area);
    }
    Shape(double length, double width) {
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Shape square = new Shape(5); 
        Shape rectangle = new Shape(4, 6);
    }
}
