package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public static RightTriangle getRandomRightTriangle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new RightTriangle(
                getRandomDimension(),
                getRandomDimension(),
                colorSupplier.getRandomColor()
        );
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle, area "
                        + getArea()
                        + ", first leg: "
                        + firstLeg
                        + ", second leg "
                        + secondLeg
                        + ", color: "
                        + getColor()
        );
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }
}
