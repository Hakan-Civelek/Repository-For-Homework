/**
 * The Circle class represents a circle shape with functionalities to calculate its area, circumference,
 * and derive radius from either area or circumference.
 * <p>
 * This class provides methods to calculate area, circumference, and determine radius based on the provided values.
 * <p>
 * The formula used for calculations:
 * <ul>
 * <li>Area = π * radius^2</li>
 * <li>Circumference = 2 * π * radius</li>
 * <li>Radius from Area = √(area / π)</li>
 * <li>Radius from Circumference = circumference / (2 * π)</li>
 * </ul>
 * <p>
 * Instances of this class can be created with a specific radius or initialized without any parameters.
 */

import java.util.Scanner;

/***
 * Test
 * For
 * Doc
 */

public class Circle {
    final double pi = 3.14;
    double radius;
    double circumference;
    double area;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea(double radius) {
        return pi * Math.pow(radius, 2);
    }

    double calculateCircumference(double radius) {
        return 2 * pi * radius;
    }

    double calculateRadiusFromArea(double area) {
        return Math.sqrt(area / pi);
    }

    double calculateRadiusFromCircumference(double circumference) {
        return circumference / (2 * pi);
    }
}

// Comment line1
// Comment line2
class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        Circle circle2 = new Circle(1.7);
        System.out.print("Radius of the circle: ");
        circle.radius = scanner.nextDouble();
        circle.area = circle.calculateArea(circle.radius);
        circle2.area = circle2.calculateArea(circle2.radius);
        circle.circumference = circle.calculateCircumference(circle.radius);
        circle2.circumference = circle2.calculateCircumference(circle2.radius);

        /* Comment line3 */

        double radiusFromArea = circle.calculateRadiusFromArea(circle.area);
        double radiusFromArea2 = circle2.calculateRadiusFromArea(circle2.area);
        double radiusFromCircumference = circle.calculateRadiusFromCircumference(circle.circumference);
        double radiusFromCircumference2 = circle2.calculateRadiusFromCircumference(circle2.circumference);

        // Comment line4
        /* Comment line5 */

        System.out.println("\n************************************************");
        System.out.println("area: " + circle2.area);
        System.out.println("circumference: " + circle2.circumference); /* Comment line6 */
        System.out.println("calculateRadiusFromArea's result: " + radiusFromArea2); /* Comment line7
         Comment line8
         */
        System.out.println("calculateRadiusFromCircumference's result: " + radiusFromCircumference2);
        /* Comment line9
         Comment line10
         */

        /* Comment line11
         Comment line12
         Comment line13 */

        /*
         Comment line14
         Comment line15 */

        System.out.println("calculateRadiusFromCircumference's result: " + radiusFromCircumference2); /*
         Comment line16
         Comment line17 */

        System.out.println("calculateRadiusFromCircumference's result: " + radiusFromCircumference2); /* Comment line18
         Comment line19
         Comment line20 */

        System.out.println("calculateRadiusFromCircumference's result: " + radiusFromCircumference2); /* Comment line21
         Comment line22
         */

        System.out.println("calculateRadiusFromCircumference's result: " + radiusFromCircumference2); /*
         Comment line23
         */
    }
}
