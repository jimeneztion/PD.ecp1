package es.upm.miw.pd.visitor.figure;

public class Circle implements Figure {

    private double radius;

    private final double PI = 3.14;

    private final double LADOS_CIRCULO = Double.POSITIVE_INFINITY;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void accept(Visitor v) {
        v.visitCircle(this);
    }

    public double area() {
        return (PI * getRadius() * getRadius());
    }

    public double lados() {
        return this.LADOS_CIRCULO;
    }

}
