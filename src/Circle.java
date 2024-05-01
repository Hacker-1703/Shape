public class Circle extends Ellipse {
    public Circle(double r) {
        this.r1 = r;
    }

    @Override
    public String toString() {
        return "R:" + r1 + super.toString();
    }
}
