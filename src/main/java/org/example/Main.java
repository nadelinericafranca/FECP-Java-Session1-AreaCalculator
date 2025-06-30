package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");

        System.out.print("Choose a shape (1-3): ");
        int shape = input.nextInt();

        switch(shape) {
            case 1:
                System.out.print("Enter the radius: ");
                double radius = input.nextDouble();

                double circleArea = calculateCircleArea(radius);
                System.out.printf("Area of the circle: %.2f", circleArea);
                break;
            case 2:
                System.out.print("Enter the base: ");
                double base = input.nextDouble();

                System.out.print("Enter the height: ");
                double height = input.nextDouble();

                double triangleArea = calculateTriangleArea(base, height);
                System.out.printf("Area of the triangle: %.2f", triangleArea);
                break;
            case 3:
                System.out.print("Enter the length: ");
                double length = input.nextDouble();

                System.out.print("Enter the width: ");
                double width = input.nextDouble();

                double rectangleArea = calculateRectangleArea(length, width);
                System.out.printf("Area of the rectangle: %.2f", rectangleArea);
                break;
            default:
                System.out.println("Invalid option. Please choose between 1-3.");
        }
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    };

    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    };

    public static double calculateRectangleArea(double length, double width){
        return length * width;
    };


}