class Calculator {
  
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int intSum = calculator.add(5, 10);
        System.out.println("Sum of integers: " + intSum);
        double doubleSum = calculator.add(5.5, 10.5);
        System.out.println("Sum of doubles: " + doubleSum);
    }
}
