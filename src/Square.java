
public class Square extends Rectangle {
    public Square(double side) {
        this.height = side;
    }

    @Override
    public String toString() {
        return "Side:" + height + super.toString();
    }
}
