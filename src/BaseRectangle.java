
public class BaseRectangle extends Rectangle {
    public BaseRectangle(double wight, double height) {
        this.height = height;
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "Wight:" + wight + " Height:" + height + super.toString();
    }
}
