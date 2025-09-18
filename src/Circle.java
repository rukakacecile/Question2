class Circle extends Shape {
    private double radius;

    public Circle(double radius) throws IllegalArgumentException {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive number");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        try {
            return Math.PI * radius * radius;
        } catch (Exception e) {
            throw new RuntimeException("Error calculating circle area: " + e.getMessage());
        }
    }

    public double getRadius() {
        return radius;
    }
}