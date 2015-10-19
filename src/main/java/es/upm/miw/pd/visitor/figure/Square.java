package es.upm.miw.pd.visitor.figure;

public class Square implements Figure {

    private double side;

    private final double LADOS_CUADRADO = 4;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void accept(Visitor v) {
        v.visitSquare(this);

    }

    public double area() {
        return (getSide() * getSide());
    }

    public double lados() {
        return this.LADOS_CUADRADO;
    }

}
