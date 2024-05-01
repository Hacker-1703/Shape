
public abstract class Rectangle extends Shape {
    protected double wight;
    protected double height;

    @Override
    public double getArea() {
        return wight * height;
    }

    @Override
    public double getPerimeter() {
        return (wight + height) * 2;
    }
}
