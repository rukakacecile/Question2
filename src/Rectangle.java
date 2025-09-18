class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) throws IllegalArgumentException {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive numbers");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        try {
            return length * width;
        } catch (Exception e) {
            throw new RuntimeException("Error calculating rectangle area: " + e.getMessage());
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}