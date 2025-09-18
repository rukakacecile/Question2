class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) throws IllegalArgumentException {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be positive numbers");
        }
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        try {
            return 0.5 * base * height;
        } catch (Exception e) {
            throw new RuntimeException("Error calculating triangle area: " + e.getMessage());
        }
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}