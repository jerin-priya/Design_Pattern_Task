
package com.mycompany.solidprinciples;

/**
 *
 * @author Jerin Hasan Priya
 */


// Single Responsibility Principle (SRP)
// Each class has a single responsibility.

// Shape interface
interface Shape {
    double calculateArea();
}

// Rectangle class
class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Circle class
class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Open/Closed Principle (OCP)
// Classes are open for extension but closed for modification.

// New Triangle class added without modifying existing classes
class Triangle implements Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Liskov Substitution Principle (LSP)
// Subtypes should be substitutable for their base types.

// Square class extending Rectangle to follow LSP
class Square implements Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Interface Segregation Principle (ISP)
// Clients should not be forced to depend on interfaces they do not use.

// Interface segregation adhered example
interface Drawable {
    void draw();
}

class Rectangle implements Shape, Drawable {
    // ...
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        // Draw the rectangle
    }
}

class Circle implements Shape, Drawable {
    // ...
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        // Draw the circle
    }
}

// Dependency Inversion Principle (DIP)
// High-level modules should not depend on low-level modules. Both should depend on abstractions.

// Dependency inversion adhered example
class AreaCalculator {
    private final Shape shape;

    public AreaCalculator(Shape shape) {
        this.shape = shape;
    }

    public double calculateArea() {
        return shape.calculateArea();
    }
}

public class SolidPrinciples {

    public static void main(String[] args) {
        System.out.println("Succesfully Done");
    }
}
