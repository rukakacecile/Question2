public class Main {
    public static void main(String[] args) {
        try {
            // Test valid shapes
            System.out.println("=== Testing Valid Shapes ===");
            Shape circle = new Circle(5.0);
            Shape rectangle = new Rectangle(4.0, 6.0);
            Shape triangle = new Triangle(3.0, 4.0);

            System.out.println("Circle with radius 5.0:");
            System.out.println("Area: " + circle.calculateArea());
            System.out.println();

            System.out.println("Rectangle with length 4.0 and width 6.0:");
            System.out.println("Area: " + rectangle.calculateArea());
            System.out.println();

            System.out.println("Triangle with base 3.0 and height 4.0:");
            System.out.println("Area: " + triangle.calculateArea());
            System.out.println();

            // Test using displayArea method
            System.out.println("Using displayArea() method:");
            circle.displayArea();
            rectangle.displayArea();
            triangle.displayArea();
            System.out.println();

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid shape creation: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        // Test invalid shapes with separate try-catch blocks
        System.out.println("\n=== Testing Invalid Shapes ===");

        try {
            Shape invalidCircle = new Circle(-2.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Circle creation failed: " + e.getMessage());
        }

        try {
            Shape invalidRectangle = new Rectangle(4.0, -1.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Rectangle creation failed: " + e.getMessage());
        }

        try {
            Shape invalidTriangle = new Triangle(0.0, 5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Triangle creation failed: " + e.getMessage());
        }

        // Test edge case
        System.out.println("\n=== Testing Edge Case ===");
        try {
            Shape verySmallCircle = new Circle(0.1);
            System.out.println("Very small circle area: " + verySmallCircle.calculateArea());
        } catch (IllegalArgumentException e) {
            System.out.println("Small circle creation failed: " + e.getMessage());
        }
    }
}