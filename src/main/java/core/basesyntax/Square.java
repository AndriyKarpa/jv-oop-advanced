package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
