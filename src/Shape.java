public abstract class Shape {
    private String color;
    private boolean filled;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Area:" + getArea() + " Perimeter:" + getPerimeter() + " Color:" + getColor() + " Filled:" + isFilled();
    }
}
