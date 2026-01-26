import java.util.Scanner;

public class Triangle extends GeometricObject {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter side 1 of the triangle: ");
            double side1 = scanner.nextDouble();
            System.out.print("Enter side 2 of the triangle: ");
            double side2 = scanner.nextDouble();
            System.out.print("Enter side 3 of the triangle: ");
            double side3 = scanner.nextDouble();
            System.out.print("Enter the color of the triangle: ");
            String color = scanner.next();
            System.out.print("Is the triangle filled (true/false)? ");
            boolean filled = scanner.nextBoolean();

            Triangle triangle = new Triangle(side1, side2, side3, color, filled);

            System.out.println(triangle);
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());
            System.out.println("Color: " + triangle.getColor());
            System.out.println("Filled: " + triangle.isFilled());
        }
    }

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    /**No-arg constructor that creates a default triangle*/
    public Triangle() {
    }

    /**Constructor that creates a triangle with specified sides*/
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**Constructor that creates a triangle with specified sides, color, and filled properties*/
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**Getter method for side1*/
    public double getSide1() {
        return side1;
    }

    /**Setter method for side1*/
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**Getter method for side2*/
    public double getSide2() {
        return side2;
    }

    /**Setter method for side2*/
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**Getter method for side3*/
    public double getSide3() {
        return side3;
    }

    /**Setter method for side3*/
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /**Returns the area of the triangle using Heron's formula*/
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**Returns the perimeter of the triangle*/
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /**Returns a string description of the triangle*/
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
