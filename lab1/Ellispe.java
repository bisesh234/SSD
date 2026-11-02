package lab1;

public class Ellispe extends Rectangle {

    // 1. Default constructor
    public Ellispe() {
    }

    // 2. Parameterized constructor passing values to Rectangle
    public Ellispe(double length, double width) {
        super(length, width);
    }

    // 3. Override getArea using inherited getters
    @Override
    public double getArea() {
        return Math.PI * getLength() * getWidth();
    }
}