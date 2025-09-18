abstract class Shape {

    public abstract double calculateArea();


    public void displayArea() {
        try {
            double area = calculateArea();
            System.out.println("Area: " + String.format("%.2f", area));
        } catch (Exception e) {
            System.out.println("Error calculating area: " + e.getMessage());
        }
    }
}