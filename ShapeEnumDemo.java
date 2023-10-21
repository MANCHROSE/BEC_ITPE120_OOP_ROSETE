enum Shape {
    RECTANGLE(4, 2, 3) {
        @Override
        double calculateArea() {
            return side1 * side2;
        }

        @Override
        double calculatePerimeter() {
            return 2 * (side1 + side2);
        }
    },
    TRIANGLE(3, 3, 4, 5) {
        @Override
        double calculateArea() {
            double s = calculatePerimeter();
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        @Override
        double calculatePerimeter() {
            return side1 + side2 + side3;
        }
    },
    SQUARE(4, 4) {
        @Override
        double calculateArea() {
            return side1 * side1;
        }

        @Override
        double calculatePerimeter() {
            return 4 * side1;
        }
    };

    double side1;
    double side2;
    double side3;
    double side4;

    Shape(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    Shape(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    Shape(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}

public class ShapeEnumDemo {
    public static void main(String[] args) {
        for (Shape shape : Shape.values()) {
            double area = shape.calculateArea();
            double perimeter = shape.calculatePerimeter();
            System.out.println("Shape: " + shape.name());
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println();
        }
    }
}
