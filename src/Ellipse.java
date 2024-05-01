public abstract class Ellipse extends Shape {
    protected double r1;
    protected double r2;

    @Override
    public double getArea() {
        return r1 * r2 * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return (Math.PI * r1 * r2 + (r1 - r2) * (r1 - r2)) / (r1 + r2) * 4;
    }
}
