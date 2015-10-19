package es.upm.miw.pd.visitor.figure;

public class Triangle implements Figure {
    private double base;

    private double height;

    private final double LADOS_TRIANGULO = 3;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void accept(Visitor v) {
        v.visitTriangle(this);
    }

    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    public double area() {
        return ((getBase() * getHeight()) / 2);
    }

    public double lados() {
        return this.LADOS_TRIANGULO;
    }

}
