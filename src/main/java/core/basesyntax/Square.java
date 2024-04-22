package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area "
                        + calculateArea()
                        + ", side: "
                        + side
                        + ", color: "
                        + getColor()
        );

    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
